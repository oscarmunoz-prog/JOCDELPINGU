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
            switch(accion) {
           
                case 0:
                sif (jugador.getInventario().getPeces() > 0) {
                    System.out.println(" La foca te roba un pez y se va");
                    jugador.getInventario().quitarPez();
                } else {
                    System.out.println(" La foca te ha mordido, no tenias peces.");
                    int retroceso = (int)(Math.random() * 3) + 1;
                    int nuevaPos = Math.max(0, jugador.getPosicion() - retroceso);
                    jugador.setPosicion(nuevaPos);
                    System.out.println(" Retrocedes " + retroceso + " casillas");
                }
                break;
                
            case 1:
                if (jugador.getInventario().getBolasNieve() > 0) {
                    System.out.println(" La foca te QUITA UNA BOLA DE NIEVE y juega con ella, se va con ella");
                    jugador.getInventario().quitarBolaNieve();

                    //En el caso de que sea 1, la foca te quitara una bola de nieve, juega con ella delante de tu cara, y se va con ella.

                } else {
                    System.out.println(" La foca te da un coletazo te ha dado un coletazo(JAJAAAA)");
                    if (jugador.getInventario().getDados() > 0) {
                        jugador.getInventario().quitarDado();
                        System.out.println(" El golpe ha hecho que pierdas un dado.");
                    }
                    //La foca ha tenido un mal dia, en caso de que tengas algun dado extra, te dara un coletazo y te lo quitara.

                }
                break;
                
            case 2:
                System.out.println(" La foca ha hecho un pequeño remolino que te ha hecho retroceder.");
                int retroceso = (int)(Math.random() * 5) + 1;
                int nuevaPos = Math.max(0, jugador.getPosicion() - retroceso);
                jugador.setPosicion(nuevaPos);
                System.out.println("  Retrocedes " + retroceso + " casillas");
                break;
                //Si el caso es el 2, la foca hara que retrocedas creando un pequeño remolino con el agua, y hara que retrocedas varias casillas.
                
            case 3:
                System.out.println(" La foca te ha quitado el turno, al parecer es mas lista que tu.");
                jugador.setTurnosSinJugar(1);
                break;
        }
        //A veces la foca es mas lista que tu, te engaña, y hace que pierdas el turno, te quedas sin tirada.
        
        System.out.println(" La foca se rie de ti, suerte a la proxima");
    }
}//La foca se despide