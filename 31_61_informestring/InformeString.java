/*Desarrolla un programa que solicite dos textos y un entero positivo y componga un pequeño informe con el resultado de las funciones anteriores*/
public class InformeString{
    public static void main(String[]args){
        System.out.println("Text principal?");
        String text= Entrada.readLine();
        
        System.out.println("Text secundari?");
        String textSec= Entrada.readLine();
        
        System.out.println("Número positiu?");
        int numero= Integer.parseInt(Entrada.readLine());
        
        System.out.println("\"" + text + "\".length(): " + text.length());
        
        boolean es1= text.startsWith(textSec);
        System.out.println("\"" + text + "\".startsWith(\""  + textSec + "\"): "  + es1);
        
        boolean es2= text.endsWith(textSec);
        System.out.println("\"" + text + "\".endsWith(\"" + textSec + "\"): "+ es2);
        
        boolean es3= text.equals(textSec);
        System.out.println("\"" + text +"\".equals(\"" + textSec + "\"): "  + es3);
        
        boolean es4= text.equalsIgnoreCase(textSec);
        System.out.println("\"" + text + "\".equalsIgnoreCase(\"" + textSec + "\"): "  + es4);
        
        boolean es5= text.isBlank();
        System.out.println("\"" + text + "\".isBlank(): " + es5);
        
        boolean es6= text.isEmpty();
        System.out.println("\"" + text + "\".isEmpty(): " + es6);
        
        System.out.println("\"" + text + "\".charAt("+ numero + "): " + text.charAt(numero));
        
        System.out.println("\"" + text + "\".concat(\"" + textSec + "\"): " + text.concat(textSec));
        
        System.out.println("\"" + text + "\".repeat(" + numero + "): " + text.repeat(numero));
        
        System.out.println("\"" + text + "\".toUpperCase(): " + text.toUpperCase());
        
        System.out.println("\"" + text + "\".toLowerCase(): " + text.toLowerCase());
    }
}
