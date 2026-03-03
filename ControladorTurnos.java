package src.JOCDELPINGU.Controladores;

import src.JOCDELPINGU.Modelo.Jugador;
import java.util.List;

public class ControladorTurnos {
    private List<Jugador> jugadores;
    private int turnoActual;
    
    public ControladorTurnos() {
        this.turnoActual = 0;
    }
     
     public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

     public Jugador getJugadorActual() {
        return jugadores.get(turnoActual);
    }
     
     public void siguienteTurno() {
        turnoActual = (turnoActual + 1) % jugadores.size();
    }
}