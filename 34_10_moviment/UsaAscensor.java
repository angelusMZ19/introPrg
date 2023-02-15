/*
desarrolla un progrmaa que ejecute el usa ascensor 
desde fuera del programa principal y qu eno contenga el main 
*/
public class UsaAscensor{
    public static void main(String[]args){
         Ascensor mover;
         mover= new Ascensor();
         System.out.println("Pis inicial: " + mover.pis);
         System.out.println("Moviment inicial: " + mover.moviment);
         mover.moviment="pujant";
         System.out.println("Moviment final: " + mover.moviment);
     }
 }

