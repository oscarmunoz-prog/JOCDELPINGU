package src.JOCDELPINGU.Modelo;
//Definimos el paquete de esta clase

public class Oso implements Entidad {
    //Creacion de la clase con herencia en Entidad

    @Override
    public String getNombre() { return "Oso"; }
    //Modelo para obtener el nombre de esta entidad, en este caso, "Oso"
    
    @Override
    public String getSimbolo() { return "🐻"; }
    //Modelo para obtener el simbolo de oso

    @Override
    public String getDescripcion() { return "El oso te atacara, ten cuidado"; }
    //Modelo para la descripción de la entidad "oso"

    @Override
    public void interactuar(Jugador jugador) {
        System.out.println("Te ataca el oso");
//Modelo VOID para definir la interacción que tendra esta entidad con el jugador