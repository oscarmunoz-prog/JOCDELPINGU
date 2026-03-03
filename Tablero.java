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