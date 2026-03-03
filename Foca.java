package src.JOCDELPINGU.Modelo;
//Definimos el paquete de esta clase

public class Foca implements Entidad {
    //Clase con herenia en Entidad

    @Override
    public String getNombre() { return "Foca"; }
    //Método para crear el nombre de la entidad, en este caso "Foca"

    
    @Override
    public String getSimbolo() { return "🦭"; }
    //Método para el simbolo de esta misma
    
    @Override
    public String getDescripcion() { return " Te ha encontrado una Foca, cuidado con ella"; }
    //Método para la descripción de la foca
    
    @Override
    public void interactuar(Jugador jugador) {
        System.out.println(" Te ataca una foca");
        //Y el método VOID, que decide que interacción tiene la foca contigo, en este caso, te ataca.
        
        int accion = (int)(Math.random() * 4);
        
        switch(accion) {
            //Evalua la variable "acción" para saber que comportamiento tendra la foca contigo.

            case 0:
                if (jugador.getInventario().getPeces() > 0) {
                    System.out.println(" La foca te roba un pez y se va");
                    jugador.getInventario().quitarPez();
            //En caso de que el caso sea 0, la foca te quitara un pez, si es que tienes alguno en el inventario

                } else {
                    System.out.println(" La foca te ha mordido, no tenias peces.");
                    int retroceso = (int)(Math.random() * 3) + 1;
                    int nuevaPos = Math.max(0, jugador.getPosicion() - retroceso);
                    jugador.setPosicion(nuevaPos);
                    System.out.println(" Retrocedes " + retroceso + " casillas");
                    //Si no tienes peces, te morderá, ya que no la has podido alimentar, y te hara retroceder casillas.

                }
                break;
