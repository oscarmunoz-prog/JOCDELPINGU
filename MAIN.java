package src.JOCDELPINGU;
//Definimos el paquete de esta clase

import src.JOCDELPINGU. Controladores.ControladorJuego;
//Importamos los métodos controladores, en específico el de ControladorJuego

public class MAIN {
    public static void main(String[] args) {
        System.out.println("JOC DEL PINGÜ - PINGU-G09_IAN-RUBIO_OSCAR-MUÑOZ_GABRIEL-MILEA");
        //Creación del título del juego, e imprimirlo por pantalla

        
        ControladorJuego juego = new ControladorJuego();
            //Nueva "instancia" para controlar el juego, creación de jugadores, tablero, es la gestión del juego.

        juego.iniciar();

        //Se llama al método inciair(), que esta en el controlador, y comenzara el juego
    }
}