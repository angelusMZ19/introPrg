/*
*/
public class MajusculitzaInicials{
    public static void main (String[]args){
    
    System.out.println("Text?");
        String text= Entrada.readLine();

        String cadena = text.toLowerCase();
        char[] caracteres = cadena.toCharArray();
        caracteres[0] = Character.toUpperCase(caracteres[0]);
      
        for (int i = 0; i < cadena.length()- 1; i++) 

        if (!(Character.isLetter(cadena.charAt(i)))|| caracteres[i] == '^')
        caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
   
        System.out.print(caracteres);
        
        System.out.println();
        return;

    }
}
