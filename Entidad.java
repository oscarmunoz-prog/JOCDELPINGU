package src.JOCDELPINGU.Modelo;
//Definimos el paquete en donde esta esta clase

public interface Entidad {
    //Declaramos interfaz publica "Entidad"

    String getNombre();
    //Método para getNombre, se crean nombres para las entidades

    String getSimbolo();
    //Método para getSimbolo, se crean simbolos para las entidades

    String getDescripcion();
    //Método para get Descripción, se crea una descripción de las entidades

    void interactuar(Jugador jugador);
    //Método que no devuelve ningun valor (Void), recibe el parametro de tipo jugador, y decide la acción que tiene segun la entidad
}