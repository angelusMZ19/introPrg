/*
Desenvolupa un programa que demani un text i dibuixi un triangle amb les lletres del text en ordre invers al text introduït
*/
public class TriangleLletresInvertit{
    public static void main(String[]args){
    
        System.out.println("Text?");
        String text = Entrada.readLine();
        int linia = text.length()-1;
        
            for(int fila= 0; fila <= linia; fila++){
                System.out.println();
                for(int col= linia -fila; col >= 0; col--){
                    if(col == 0){
                        System.out.print(text.charAt(col));
                    }else{
                        System.out.print( text.charAt(col) + ", " );
                    }
                }
            }
            System.out.println();
    }
}
