/*
*/
public class TriangleLletresInvertit{
    public static void main(String[]args){
    
        System.out.println("Text?");
        String text = Entrada.readLine();

        dibuixaTriangleInvertit(text);
    }
    public static void dibuixaTriangleInvertit(String text){

        for(int fila= 0; fila <= text.length()-1; fila++){
            System.out.println("");
            dibuixaLiniaInvertida(text, fila);
        }
    }
    public static void dibuixaLiniaInvertida(String text, int linia){
            for(int col= (text.length()-1) - linia; col >= 0; col--){
                if(col == 0){
                    System.out.print(text.charAt(col));
                }else{
                    System.out.print( text.charAt(col) + ", " );
                }
            }
    }
}



