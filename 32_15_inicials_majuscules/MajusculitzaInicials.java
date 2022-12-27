/*
*/
public class MajusculitzaInicials{
    public static void main (String[]args){
    
    System.out.println("Text?");
        String text= Entrada.readLine();

        /*int inverso = text.length()-1;
        String cad= "";
        boolean chequeo= false;
        for (int i = inverso; i >= 0; i--){
        if (Character.isLetter(text.charAt(i))){
              cad = cad + text.charAt(i);
                if(chequeo == false){
                    System.out.print(text.charAt(i));
                    chequeo = true;
                }else{
                    System.out.print(", " +text.toUpperCase() );
                }
            }else{
            System.out.print(", " + text.charAt(i));
        }
        }
        System.out.println();*/
        String cadena = text.toLowerCase();
        char[] caracteres = cadena.toCharArray();
        caracteres[0] = Character.toUpperCase(caracteres[0]);
      
        for (int i = 0; i < cadena.length()- 2; i++) 
        // Es 'palabra'
        if (caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',')
        // Reemplazamos
        caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
   
        System.out.print(caracteres);
        System.out.println();
        return;
    }
}

