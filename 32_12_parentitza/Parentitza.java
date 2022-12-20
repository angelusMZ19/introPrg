/*
La nova versió tindrà la mateixa sortida que l'original però el codi del programa serà més modular. En concret, el mòdul main() se n'encarregarà d'obtenir les dades d'entrada, i cridarà un nou mòdul que serà qui realitzi realment la feina.
*/
public class Parentitza{
    public static void main (String[]args){
    
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        parentitza(text);
    }
    public static void parentitza(String text){ 
        for(int i = 0; i < text.length(); i++){
            if (text.charAt(i) == ' ' ){
                System.out.print(" ");
            }else if(text.charAt(i) == '.'){
                    System.out.print(".");
                        }else{
                            System.out.print("(" + text.charAt(i) + ")");
            }
        }
        System.out.println();
    }
}
