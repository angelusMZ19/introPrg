/*
 poner la condicicon que no me ponga entre parentiesis todoa quello que no sea letras 
*/
public class Parentitza{
    public static void main (String[]args){
    
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        for(int i = 0; i < text.length(); i++){
                    if (Character.isLetter(text.charAt(i))){
                            System.out.print("(" + text.charAt(i) + ")");
                        }else{
                        System.out.print(text.charAt(i));
            }
        }
        System.out.println();
    }
}


