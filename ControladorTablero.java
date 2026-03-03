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
        
    }
    
    public void generarTablero() {
        tablero = new Tablero();
    }
   //Esto lo que hace es permitir generar otro tablero, crea otro atributo de tablero y su constructor para hacer uno nuevo.
    
    public Casilla getCasilla(int posicion) {
        return tablero.getCasilla(posicion);
    }
//Esto es un método que obtiene la casilla según su posición.
//Recibe el parametro "int", llama al metodo getCasilla, y devuelve la casilla con la posición que toca,

   public void mostrarTablero() {
        tablero.mostrarTablero();
    }

    //Método publico que hace el tablero visible, llama al metodo mostrarTablero, y luego muestra el tablero.