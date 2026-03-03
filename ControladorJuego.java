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