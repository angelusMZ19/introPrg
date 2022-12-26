/*
Desenvolupa un programa que demani un text i mostri totes les lletres en minúscules excepte les vocals, que hauran d'estar en majúscules.
Per simplicitat, considerarem només les vocals a, e, i, o i u
*/
public class VocalsMajuscules {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
       
        System.out.println();
 
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
        System.out.println();
    }
}
