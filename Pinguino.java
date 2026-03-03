package src.JOCDELPINGU.Modelo;
//Definimos el paquete de esta clase

public class Pinguino implements Entidad {
    //Creacion de la clase con herencia en entidad

    @Override
    public String getNombre() { return "Pingüino"; }
    //Método para el nombre de esta entidad, en este caso "Pingüino"
    
    @Override
    public String getSimbolo() { return "🐧"; }
    //Método para obtener el simbolo del pingüino

    @Override
    public String getDescripcion() { return "Punto de salida"; }
    //Método para la descripción de esta entidad.
    
    @Override
    public void interactuar(Jugador jugador) {
        System.out.println("Estás en la casilla de los pingüinos.");

        //Método para definir la interacción de esta entidad ocn el jugador, en este caso, es la casilla de inicio.
    }
}