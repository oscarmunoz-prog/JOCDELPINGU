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