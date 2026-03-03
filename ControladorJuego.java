package src.JOCDELPINGU.Controladores;

//Importamos otras clases que vamos a necesitar
import src.JOCDELPINGU.Vista.VistaJuego;
import src.JOCDELPINGU.Modelo.Casilla;
import src.JOCDELPINGU.Modelo.Jugador;

import java.util.Scanner;

public class ControladorJuego {
    private ControladorJugador controladorJugador;
    private ControladorTablero controladorTablero;
    private ControladorTurnos controladorTurnos;
    private ControladorEventos controladorEventos;
    private VistaJuego vista;
    private boolean juegoActivo;
    private Scanner scanner;