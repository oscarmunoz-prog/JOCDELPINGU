package src.JOCDELPINGU.Modelo;
//Definimos el paquete de esta clase

public class Foca implements Entidad {
    //Clase con herenia en Entidad

    @Override
    public String getNombre() { return "Foca"; }
    //Método para crear el nombre de la entidad, en este caso "Foca"

    
    @Override
    public String getSimbolo() { return "🦭"; }
    //Método para el simbolo de esta misma
    
    @Override
    public String getDescripcion() { return " Te ha encontrado una Foca, cuidado con ella"; }
    //Método para la descripción de la foca
    
    @Override
    public void interactuar(Jugador jugador) {
        System.out.println(" Te ataca una foca");
        //Y el método VOID, que decide que interacción tiene la foca contigo, en este caso, te ataca.
        
        int accion = (int)(Math.random() * 4);
        
