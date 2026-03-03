package src.JOCDELPINGU.Controladores;
//Definimos el paquete en donde se encuentra esta clase.

import src.JOCDELPINGU.Modelo.Tablero;
import src.JOCDELPINGU.Modelo.Casilla;
//Importamos clases ESPECÍFICAS de un package en concreto.

public class ControladorTablero {
    private Tablero tablero;
    //Declaramos atributo privado de tablero.

    
    public ControladorTablero() {
        this.tablero = new Tablero();
        //Contructor de la clase que inicia el atributo de tablero, creando la clase tablero del modelo.
        

