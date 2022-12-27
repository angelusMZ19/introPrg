/*
Desenvolupa una nova versió de l'exercici que posava en majúscules les inicials d'un text.
La nova versió tindrà la mateixa sortida que l'original però el codi del programa serà més modular. En concret, el mòdul main() se n'encarregarà d'obtenir les dades d'entrada, i cridarà un nou mòdul que serà qui realitzi realment la feina
*/
public class MajusculitzaInicials{
    public static void main (String[]args){
    
    System.out.println("Text?");
        String cadena= Entrada.readLine();

        String text = cadena.toLowerCase();
        char[] caracteres = text.toCharArray();
        caracteres[0] = Character.toUpperCase(caracteres[0]);

        if(!(cadena.isBlank()) || !(cadena.isEmpty())){
        for (int i = 0; i <text.length()- 1; i++)
            if (!(Character.isLetter(text.charAt(i)))|| caracteres[i] == '^')
                caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
                    System.out.print(caracteres);
                    System.out.println();
                    return;
    }else {
    System.out.println("error");
    }
    }
}
