/**/
/*public class MostraLletres{
     public static void main(String[] args){
         String text = Entrada.readLine() ;
         int quantes = quantesLletres(text);
         System.out.println("El text:");
         System.out.println("\t\""+ text + "\"");
         System.out.println("conté " +
                            quantes +
                            " lletr" +
                            (quantes == 1 ? "a" : "es")
                           );
     }

     public static int quantesLletres(String text) {
         int comptador = 0;
         for (int i = 0; i < text.length(); i++) {
             char actual = text.charAt(i);
             if (Character.isLetter(actual)) {
                 comptador += 1;
             }
         }
         return comptador;
     }
}*/

/*
        System.out.println("Text?");
        String text = Entrada.readLine();
        mostraLletres(text);
        System.out.println();   // un salt de línia final
    }

    // mostra només les lletres de text
    public static void mostraLletres(String text) {
        if(text.length()==0) {      // cas base
            return;
        }

        // hi ha al menys un caràcter. Comptem quantes lletres hi queden

        // considerem el primer caràcter
        char primer = text.charAt(0);
        if (Character.isLetter(primer)) {
            letra = text.charAt(i);
              cad = cad + letra;
        }

        // considerem les lletres que conté la resta del text
        String restaText =  XXX ;  // resta del text
        mostraLletres(restaText);      // crida recursiva

    }
}
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











