/*
Desenvolupa un programa que demani un text i mostri només les lletres que conté. Cada lletra apareixerà separada per una coma en l'ordre en que apareixia al text original. La resta de caràcters no es mostraran.
*/
public class NomesLletres{
    public static void main (String[]args){
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        char letra;
        String cad= "";
        boolean chequeo= false;
        for(int i = 0; i < text.length(); i++){
             if (Character.isLetter(text.charAt(i))){
              letra = text.charAt(i);
              cad = cad + letra;
                if(chequeo == false){
                    System.out.print(letra);
                    chequeo = true;
                }else{
                    System.out.print(", " + letra);
                } 
            }
        }
        System.out.println();
    }
}

