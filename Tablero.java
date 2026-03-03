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