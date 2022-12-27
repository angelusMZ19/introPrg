/*
Desenvolupa un programa que demani un text i mostri el mateix text amb les inicials de cada paraula en majúscules i la resta en minúscules.
Una paraula és cada segment del text que només conté lletres que davant i darrere tenen quelcom que no sigui una lletra, o bé són la primera o darrera paraula del text.
*/
public class MajusculitzaInicials{
    public static void main (String[]args){

        System.out.println("Text?");
        String cadena= Entrada.readLine();
        
                String text = cadena.toLowerCase();
                char[] caracteres = text.toCharArray();
                caracteres[0] = Character.toUpperCase(caracteres[0]);
        while(!(text.isBlank()) && !(text.isEmpty())){
        for (int i = 0; i <text.length()- 1; i++)
            if (!(Character.isLetter(text.charAt(i)))|| caracteres[i] == '^')
                caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
                    System.out.print(caracteres);
                    System.out.println();
                    return;
        }
    }
}
