/*
*/
public class TriangleLletresInvertit{
    public static void main(String[]args){
    
        System.out.println("Text");
        String text = Entrada.readLine();
        int linia = text.length();
        
        linia = text.length();
        if (linia >= 0){
            for(int fila= 0; fila <= linia; fila++){
                System.out.println("");
                for(int col= 0; col < (linia-fila); col++){
                    if(col == 0){
                        System.out.print(text.charAt(col));
                    }else{
                        System.out.print(", " + text.charAt(col));
                    }
                }
            }
        }else {
            System.out.println("");
        }
    }
}
