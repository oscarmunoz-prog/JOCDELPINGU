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