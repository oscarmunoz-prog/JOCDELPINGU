package src.JOCDELPINGU.Controladores;

import src.JOCDELPINGU.Modelo.Jugador;
import java.util.List;

public class ControladorTurnos {
    private List<Jugador> jugadores;
    private int turnoActual;
    
    public ControladorTurnos() {
        this.turnoActual = 0;
    }
