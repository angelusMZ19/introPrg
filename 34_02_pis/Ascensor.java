/*
programam en el que se implementara un ascensor 
del que solo nos interesara saber en que piso se encuentra
*/
public class Ascensor{
    public int pis = -1;
    public static void main(String[]args){
         Ascensor mover;
         mover = new Ascensor();
         System.out.println(" L'ascensor està a la planta " + mover.pis);
    }
}
