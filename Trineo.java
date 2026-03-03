package src.JOCDELPINGU.Modelo;

//Declara la clase Trineo que implementa a Entidad
public class Trineo implements Entidad {
    @Override
    //Método que devuelve un String con el nombre
    public String getNombre() { return "Trineo"; }
     @Override
    //Método que devuelve un String con el símbolo
    public String getSimbolo() { return "🛷"; }
    
    @Override
    //Funcion que devuelve la descripción del objeto
    public String getDescripcion() { return "¡Te impulsa hacia adelante!"; } //Explica qué hace el trineo

     @Override
     //Método que define qué pasa cuando el jugador interactúa con el trineo
    public void interactuar(Jugador jugador) {
        int avance = (int)(Math.random() * 4) + 2; // 2-5 casillas
        System.out.println("  🛷 ¡Encuentras un trineo!"); //Muestra un mensaje en consola indicando que encontró un trineo
        System.out.println("  ⬆️ Avanzas " + avance + " casillas extra"); //Muestra cuántas casillas avanza de más
        //Calcula la nueva posición sin pasarse del final
        int nuevaPos = Math.min(49, jugador.getPosicion() + avance);
        jugador.setPosicion(nuevaPos); //Actualiza la posicion del jugador
    }
}
    
   
   
