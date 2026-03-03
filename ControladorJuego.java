package src.JOCDELPINGU.Controladores;

//Importamos otras clases que vamos a necesitar
import src.JOCDELPINGU.Vista.VistaJuego;
import src.JOCDELPINGU.Modelo.Casilla;
import src.JOCDELPINGU.Modelo.Jugador;

import java.util.Scanner;

public class ControladorJuego {

    //Declaramos las variables que va a necesitar la clase
    private ControladorJugador controladorJugador;
    private ControladorTablero controladorTablero;
    private ControladorTurnos controladorTurnos;
    private ControladorEventos controladorEventos;
    private VistaJuego vista;
    private boolean juegoActivo;
    private Scanner scanner;

    //Creamos el constructor de la clase
    public ControladorJuego() {
        //Creamos todos los objetos que se necesitan
        this.controladorJugador = new ControladorJugador();
        this.controladorTablero = new ControladorTablero();
        this.controladorTurnos = new ControladorTurnos();
        this.controladorEventos = new ControladorEventos();
        this.vista = new VistaJuego();
        this.juegoActivo = true; //El juego empieza activo
        this.scanner = new Scanner(System.in);
    }
    //Creamos el metodo principal que inicia el juego
    public void iniciar() {
        int opcion;
        do {
            //Llama al método que muestra el menú
            mostrarMenuPrincipal(); 
            opcion = scanner.nextInt();
            scanner.nextLine();
            //switch para elegir qué hacer según la opción
            switch(opcion) {
                case 1:
                    nuevaPartida(); //Si elige 1 se llama al método nuevaPartida()
                    break;
                case 2:
                    System.out.println("Opción no implementada"); // Si elige 2 sale un mensaje de que no está implementado
                    break;
                case 3:
                    System.out.println("¡Gracias por jugar!"); //Si elige 3 sale un mensaje de despedida
                    break;
                default:
                    System.out.println("Opción no válida"); // Y si no elige ni 1 ni 2 ni 3 pues sale un error
            }
        } while(opcion != 3);
    }
    //Metodo privado para mostrar el menu principal
    private void mostrarMenuPrincipal() {
        //Opciones del menu por pantalla
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Nueva partida");
        System.out.println("2. Cargar partida");
        System.out.println("3. Salir");
        System.out.print("Elige: ");
    }
    //Metodo para crear una nueva partida
    private void nuevaPartida() {
        //Pide cuantos jugadores humanos van a jugar
        System.out.print("\n¿Cuántos jugadores humanos? (1-3): ");
        int numHumanos = scanner.nextInt();
        //Pregunta si se quiere jugar contra la IA
        System.out.print("¿Incluir IA? (s/n): ");
        String incluirIA = scanner.next();
        
        controladorJugador.inicializarJugadores(numHumanos, incluirIA.equalsIgnoreCase("s")); //Llama al ControladorJugador
        controladorTablero.generarTablero(); //Crea el tablero con todas sus casillas
        controladorTurnos.setJugadores(controladorJugador.getJugadores()); //Pasa al controlador de turnos la lista de jugadores
        
        vista.mostrarInicioPartida(); //Muestra mensaje de inicio
        controladorTablero.mostrarTablero(); //Muestra el tablero vacío

        //Llama al metodo que inicia el juego
        jugar();
    }
    //Metodo principal del juego
    private void jugar() {
        juegoActivo = true; //Activa el juego
        //Bucle que se ejecuta mientras el juego este activo
        while(juegoActivo) {
            Jugador jugadorActual = controladorTurnos.getJugadorActual(); //Obtiene al jugador que le toca jugar ahora
            
            if (jugadorActual.esIA()) {
                procesarTurnoIA(jugadorActual); //Si el jugador es IA se llama al método para IA
            } else {
                procesarTurnoHumano(jugadorActual); //Y si es humano pues llama al metodo para humano
            }
            //Comprueba si alguien ha ganado y si hay un ganador pues se finaliza la partida
            if (haGanado(jugadorActual)) {
                finalizarPartida(jugadorActual);
                break;
            }
            
            controladorTurnos.siguienteTurno(); //Pasa al siguiente jugador
            //Pausa hasta que el usuario le de a ENTER
            System.out.println("\nPresiona ENTER para continuar...");
            scanner.nextLine();
        }
    }
    //Metodo para procesar el turno de un jugador humano
    private void procesarTurnoHumano(Jugador jugador) {
        vista.mostrarTurno(jugador); //Muestra el turno del jugador
        //Espera a que el usuario pulse ENTER para lanzar el dado
        System.out.print("Presiona ENTER para lanzar dado...");
        scanner.nextLine();
        //Llama al método del jugador para lanzar el dado y muestra el resultado
        int dado = jugador.lanzarDado();
        System.out.println("  🎲 Dado: " + dado);
        //Llama al método que mueve al jugador
        moverJugador(jugador, dado);
    }
    //Metodo para procesar el turno de la IA
    private void procesarTurnoIA(Jugador ia) {
        vista.mostrarTurnoIA(ia); //Muestra que es el turno de la IA
        //La IA lanza el dado automáticamente
        int dado = ia.lanzarDado();
        System.out.println("  🎲 Dado: " + dado);
        
        moverJugador(ia, dado); //Mueve a la IA
    }
    //Método que mueve al jugador según los pasos del dado
    private void moverJugador(Jugador jugador, int pasos) {
        //Calcula la nueva posición:
        int nuevaPosicion = Math.min(jugador.getPosicion() + pasos, 49);
        jugador.setPosicion(nuevaPosicion); //Actualiza la posicion del Jugador
        //Muestra la nueva posicion
        System.out.println("  📍 Nueva posición: " + (nuevaPosicion + 1));
        //Obtiene la casilla donde cayo y muestra su descripcion
        Casilla casilla = controladorTablero.getCasilla(nuevaPosicion);
        System.out.println("  📌 " + casilla.getDescripcion());
        //Procesa los eventos especiales de esa casilla
        controladorEventos.procesarCasilla(jugador, casilla);
        //Muestra el inventario del jugador actualizado
        System.out.println("  " + jugador.getInventario().obtenerResumen());
    }