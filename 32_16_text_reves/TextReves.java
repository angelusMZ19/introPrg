/*
La nova versió tindrà la mateixa sortida que l'original però el codi del programa serà més modular. En concret, el mòdul main() se n'encarregarà d'obtenir les dades d'entrada, i cridarà un nou mòdul que serà qui realitzi realment la feina.
*/
public class TextReves{
    public static void main (String[]args){
    
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        mostraReves(text);
    }
    public static void mostraReves(String text){
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

