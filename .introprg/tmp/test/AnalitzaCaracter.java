/*Desarrolla un programa que solicite un texto y una posición.

Si la posición no existe dentro del texto, indicará que está fuera de rango.

Si la posición es negativa, empezará a contar a partir del último carácter del texto introducido. Por ejemplo, -1 corresponderá al último carácter.
*/

public class AnalitzaCaracter{
    public static void main(String[]args){
    
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        System.out.println("Posició?");
        int num= Integer.parseInt(Entrada.readLine());
    
        if (num > text.length() - 1 || Math.abs(num) > text.length()){
            System.out.println("Fora de Rang");
        }   else{
                if (num < 0){
                    num = text.length() + num;
                }
                char numText = text.charAt(num);
                if (Character.isLetter(numText)){
                    String isLetter = String.format("\'%c\' és una lletra", numText);
                    System.out.println(isLetter);
                } else if(Character.isDigit(numText)){
                    String isDigit = String.format("\'%c\' és un nombre", numText);
                    System.out.println(isDigit);
                } else if(!Character.isLetter(numText) && !Character.isDigit(numText)){
                    String altraCosa = String.format("\'%c\' és una altra cosa", numText);
                    System.out.println(altraCosa);
                }
            }
    }
}
