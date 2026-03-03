package src.JOCDELPINGU.Controladores;

import src.JOCDELPINGU.Modelo.Jugador;
import java.util.List;

//Controla la gestion de turnos entre los jugadores
public class ControladorTurnos {

    //Lista de jugadores que participan en la partida
    private List<Jugador> jugadores;

    //Indice del jugador cuyo turno esta activo
    private int turnoActual;
    
    //Inicializa el turno en la posicion 0 (primer jugador)
    public ControladorTurnos() {
        this.turnoActual = 0;
    }
     
     //Asigna la lista de jugadores al controlador
     public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    //Devuelve el jugador correspondiente al turno actual
     public Jugador getJugadorActual() {
        return jugadores.get(turnoActual);
    }
     
    //Avanza al siguiente turno de forma ciclica
     public void siguienteTurno() {
        turnoActual = (turnoActual + 1) % jugadores.size();
    }
}