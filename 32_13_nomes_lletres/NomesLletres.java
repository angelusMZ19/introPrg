/*
La nova versió tindrà la mateixa sortida que l'original però el codi del programa serà més modular. En concret, el mòdul main() se n'encarregarà d'obtenir les dades d'entrada, i cridarà un nou mòdul que serà qui realitzi realment la feina.
*/
public class NomesLletres{
    public static void main (String[]args){
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        filtraLletres(text);
    }
    public static void filtraLletres(String text){ 
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

/*if (Character.isLetter(text.charAt(i))){
     System.out.print( text.charAt(i) + ", ");
 }*/
