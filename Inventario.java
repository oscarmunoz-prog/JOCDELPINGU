package src.JOCDELPINGU.Modelo;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<item.TipoItem, Integer> items;
    
    private static final int MAX_PECES = 2;
    private static final int MAX_BOLAS = 6;
    private static final int MAX_DADOS = 3;
    //Constructor de la clase
    public Inventario() {
        items = new HashMap<>();
        items.put(item.TipoItem.PEZ, 2);      // Empiezan con 2 peces
        items.put(item.TipoItem.BOLA_NIEVE, 0);
        items.put(item.TipoItem.DADO, 1);      // Empiezan con 1 dado
    }
    //Método público para añadir un pez al inventario
    public void agregarPez() {
        //Obtiene la cantidad actual de peces
        int actual = items.get(item.TipoItem.PEZ);
        //Comprueba si no ha llegado al máximo
        if (actual < MAX_PECES) {
            //Añade un pez
            items.put(item.TipoItem.PEZ, actual + 1);
        }
    }
    //Método público para quitar un pez
    public boolean quitarPez() {
        //Obtiene la cantidad actual de peces
        int actual = items.get(item.TipoItem.PEZ);
        //Comprueba si hay al menos 1 pez
        if (actual > 0) {
            //Quita un pez y actualiza el mapa
            items.put(item.TipoItem.PEZ, actual - 1);
            return true;
        }
        return false;
    }
    //Método para añadir una bola de nieve
    public void agregarBolaNieve() {
        int actual = items.get(item.TipoItem.BOLA_NIEVE);
        if (actual < MAX_BOLAS) {
            items.put(item.TipoItem.BOLA_NIEVE, actual + 1);
        }
    }
    //Método para quitar una bola de nieve
    public boolean quitarBolaNieve() {
        int actual = items.get(item.TipoItem.BOLA_NIEVE);
        if (actual > 0) {
            items.put(item.TipoItem.BOLA_NIEVE, actual - 1);
            return true;
        }
        return false;
    }
    //Funcion para añadir un dado
    public void agregarDado() {
        int actual = items.get(item.TipoItem.DADO);
        if (actual < MAX_DADOS) {
            items.put(item.TipoItem.DADO, actual + 1);
        }
    }
    //Método para quitar un dado
    public boolean quitarDado() {
        //Obtiene cantidad actual
        int actual = items.get(item.TipoItem.DADO);
        if (actual > 0) {
            //Si hay al menos 1, lo quita y devuelve true
            items.put(item.TipoItem.DADO, actual - 1);
            return true;
        }
        return false;
    }
    //Getter que devuelve la cantidad de peces
    public int getPeces() { return items.get(item.TipoItem.PEZ); }
    //Getter que devuelve la cantidad de dados
    public int getBolasNieve() { return items.get(item.TipoItem.BOLA_NIEVE); }