package src.JOCDELPINGU.Controladores;
//Define el paquete en donde esta esta clase

import src.JOCDELPINGU.Modelo.*;
//Importa todas las clases Modelo

public class ControladorEventos {
//Declaramos la clase publica
    
    public void procesarCasilla(Jugador jugador, Casilla casilla) {
//Vuelve a declarar clase publica
        Entidad entidad = null;
    
    
        switch(casilla.getTipo()) {
            //Evalua las casillas mediante getTipo
           
            case PINGUINO:
                entidad = new Pinguino();
                break;
            //Si la casilla es pinguino, crear el objeto pinguino

            case OSO:
                entidad = new Oso();
                break;
            //Si la casilla es un Oso, crear esta objeto
            
            case AGUJERO:
                entidad = new AgujeroHielo();
                break;
            //Vuelve a ser lo mismo, en caso de, crear el objeto

            case TRINEO:
                entidad = new Trineo();
                break;
            //Crear el objeto trineo

            case INTERROGANTE:
                eventoAleatorio(jugador);
                return;
            //Y en caso de ser un evento aleatorio,, y llamar al eventoAleatorio.

        }
        if (entidad != null) {
                entidad.interactuar(jugador);
            }
        }
    //Si se crea una entidad que no es NULL, llamar al método interactuar.


        private void eventoAleatorio(Jugador jugador) {
            int evento = (int)(Math.random() * 5);
            //Genera un numero aleatorio entre 0 y 4, y se convierte a int.
        
            switch(evento) {
    //Evalua al evento que haya salido

                case 0:
                    System.out.println(" Evento: Has encontrado un pez");
                        jugador.getInventario().agregarPez();
                    break;

                    //Si el evento es 0, imprimir el evento del pescado.
                    
                case 1:
                    System.out.println(" Evento: Has encontrado una bola de nieve");
                    jugador.getInventario().agregarBolaNieve();
                break;

                //Si el evento es 1, imprimir evento de bola de nieve
            
            
                case 2:
                    System.out.println(" Evento: Has conseguido un dado extra");
                    jugador.getInventario().agregarDado();
                break;
            
                //Si es 2, evento de dado extra.
            
                case 3:
                    if (jugador.getInventario().getDados() > 1) {
                        System.out.println(" Evento: Has perdido un dado");
                        jugador.getInventario().quitarDado();
                    }
                break;
            //Si es 3, imprimir que has perdido un dado
            
                case 4:
                    Foca foca = new Foca();
                    foca.interactuar(jugador);
                break;

                //Y si es 4, se crea a la foca, y hace que interactue con el jugador.
        }
    }
}       

      

        
