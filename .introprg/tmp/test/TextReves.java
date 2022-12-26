/*
Desenvolupa un programa que demani un text i el torni a mostrar però invertint l'ordre dels caràcters que el composen. Els caracters resultants apareixeran separats per comes
*/
public class TextReves{
    public static void main (String[]args){
    
        System.out.println("Text?");
        String text= Entrada.readLine();

        int inverso = text.length()-1;
        String cad= "";
        boolean chequeo= false;
        for (int i = inverso; i >= 0; i--){
        if (Character.isLetter(text.charAt(i))){
              cad = cad + text.charAt(i);
                if(chequeo == false){
                    System.out.print(text.charAt(i));
                    chequeo = true;
                }else{
                    System.out.print(", " +text.charAt(i) );
                }
            }else{
            System.out.print(", " + text.charAt(i));
        }
        }
        System.out.println();
    }
}

