package src.JOCDELPINGU.Modelo;

import java.util.ArrayList;
import java.util.List;
//Declara la clase Tablero
public class Tablero {
    //Declara una lista privada que contendrá objetos de tipo Casilla
    private List<Casilla> casillas;
    //Declara una constante que define el tamaño del tablero
    private static final int TAMANO = 50;

    //Constructor de la clase
    public Tablero() {
        casillas = new ArrayList<>();
        generarTablero();
    }

    private void generarTablero() {
        // Primera casilla siempre pingüino
        casillas.add(new Casilla(0, TipoCasilla.PINGUINO));
        
        // Generar el resto aleatoriamente
        TipoCasilla[] tipos = TipoCasilla.values();
        for(int i = 1; i < TAMANO; i++) {
            int aleatorio = (int)(Math.random() * tipos.length);
            casillas.add(new Casilla(i, tipos[aleatorio]));
        }
    }
    //Método público para obtener una casilla por su posición
    public Casilla getCasilla(int index) {
        return casillas.get(index); //Devuelve la casilla en la posición index de la lista
    }
    //Método que devuelve el tamaño del tablero
    public int getTamano() { return TAMANO; }
    //Método público que muestra el tablero por consola
    public void mostrarTablero() {
        //Imprime un encabezado indicando el número de casillas
        System.out.println("\n--- TABLERO (50 casillas) ---");
        //Bucle que recorre todas las casillas
        for(int i = 0; i < TAMANO; i++) {
            if(i % 10 == 0 && i > 0) System.out.println();
            System.out.print(i + ":" + casillas.get(i).getSimbolo() + " ");
        }
        System.out.println("\n");
    }
}