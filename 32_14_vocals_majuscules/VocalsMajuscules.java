/*
La nova versió tindrà la mateixa sortida que l'original però el codi del programa serà més modular. En concret, el mòdul main() se n'encarregarà d'obtenir les dades d'entrada, i cridarà un nou mòdul que serà qui realitzi realment la feina.
*/
public class VocalsMajuscules {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        majusculitzaVocals(text);
        System.out.println();
    }
    public static void majusculitzaVocals(String text) {
        char minusculas;
        char mayusculas;

        String cadena = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u' || text.charAt(i) == 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'I' || text.charAt(i) == 'O' || text.charAt(i) == 'U') {
                mayusculas = Character.toUpperCase(text.charAt(i));
                cadena = cadena + mayusculas; 
            } else {
                minusculas = Character.toLowerCase(text.charAt(i));
                cadena = cadena + minusculas; 
            }
        }
        System.out.print(cadena);
    }
}
