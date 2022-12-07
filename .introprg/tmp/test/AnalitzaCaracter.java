/*
32_07__La nueva versión tendrá el mismo comportamiento que el original pero el código será distinto:
el módulo main()se encargará de obtener los datos de entrada, comprobará que sean válidos, mostrará los errores correspondientes, y extraerá el carácter que finalmente deberá analizarse.
Este carácter a analizar se le pasará al módulo analitzaCaracter()que será quien se encargue de realizar el análisis.

*/
public class AnalitzaCaracter{
   public static void main(String[]args){

        System.out.println("Text?");
        String text= Entrada.readLine();

        System.out.println("Posició?");
        int num= Integer.parseInt(Entrada.readLine());

        if (num > text.length() - 1 || Math.abs(num) > text.length()){
            System.out.println("Fora de rang");
        }   else{
                if (num < 0){
                    num = text.length() + num;
                }
                char numText = text.charAt(num);
            analitzaCaracter(numText);
            }
        
    }
    public static void analitzaCaracter(char caracter){
                
                if (Character.isLetter(caracter)){
                    String isLetter = String.format("\'%c\' és una lletra", caracter);
                    System.out.println(isLetter);
                } else if(Character.isDigit(caracter)){
                    String isDigit = String.format("\'%c\' és un nombre", caracter);
                    System.out.println(isDigit);
                } else if(!Character.isLetter(caracter) && !Character.isDigit(caracter)){
                    String altraCosa = String.format("\'%c\' és una altra cosa", caracter);
                    System.out.println(altraCosa);
                }
    }
}

