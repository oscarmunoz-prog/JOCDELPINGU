package src.JOCDELPINGU.Modelo;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<item.TipoItem, Integer> items;
    
    private static final int MAX_PECES = 2;
    private static final int MAX_BOLAS = 6;
    private static final int MAX_DADOS = 3;