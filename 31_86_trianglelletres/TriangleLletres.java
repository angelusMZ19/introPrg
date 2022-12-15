/*
Desenvolupa un programa que demani un text i dibuixi un triangle amb les lletres del text.
*/
public class TriangleLletres{
    public static void main (String[]args){
    
        System.out.println("Text?");
        String text = Entrada.readLine();
            for( int fila = 0; fila < text.length(); fila++){
                for (int col = 0; col <= fila ; col++){
                    System.out.print(text.charAt(col));
                    if(col != fila){
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
    }
}
