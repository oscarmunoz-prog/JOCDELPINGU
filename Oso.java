package src.JOCDELPINGU.Modelo;
//Definimos el paquete de esta clase

public class Oso implements Entidad {
    //Creacion de la clase con herencia en Entidad

    @Override
    public String getNombre() { return "Oso"; }
    //Modelo para obtener el nombre de esta entidad, en este caso, "Oso"
    
    @Override
    public String getSimbolo() { return "🐻"; }
    //Modelo para obtener el simbolo de oso

    @Override
    public String getDescripcion() { return "El oso te atacara, ten cuidado"; }
    //Modelo para la descripción de la entidad "oso"

    @Override
    public void interactuar(Jugador jugador) {
        System.out.println("Te ataca el oso");
//Modelo VOID para definir la interacción que tendra esta entidad con el jugador

        
        if (jugador.getInventario().getPeces() > 0 && Math.random() < 0.5) {
            //Se verifica si el jugador tiene aunque sea 1 pez en su inventario, se genera un numero aleatorio entre 0.0 y 1.0
            //Si este numero es menor que 0.50%(probabilidad)

            System.out.println("Has sobornado al oso y has conseguido pasar");
            jugador.getInventario().quitarPez();
            //Se sobornara al Oso con un pescado, "esto si lo tienes ne el inventario"

        } else {
            System.out.println("Te ha pillado, vuelves al inicio");
            jugador.setPosicion(0);

            //Si es mayor a 0.50, te atacara y volveras a la casilla de inicio
        }
    }
}