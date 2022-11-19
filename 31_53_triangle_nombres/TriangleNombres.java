/*Desenvolupa un programa que demani un nombre positiu més gran que 0. El programa escriurà una línia per nombre entre el 1 i el nombre introduït (es a dir, creixentment). A cada línia escriurà tots els nombres des del nombre corresponent a la línia fins al 1*/

public class TriangleNombres{
    public static void main (String[]args){
    
        System.out.println("Nombre?");
            int valor = Integer.parseInt(Entrada.readLine());
        if (valor < 1){
            System.out.println("");
            }else{
                for( int fila = 1; fila <= valor; fila++){
                    for (int columna = fila; columna >= 1; columna--){
                System.out.print(" " + columna);
                    }
                    System.out.println(" ");
                }
            }
    }
}
