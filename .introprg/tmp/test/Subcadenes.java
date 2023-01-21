/**/
public class Subcadenes{
    public static void main (String[]args){
    
    System.out.println("Text?");
    String text= Entrada.readLine();
    text= filtraLetras(text);
    divisionString(text);
    
    }
    
    public static String filtraLetras(String text){
    
        String filtrado = "";
        if (text.isEmpty()){
            return filtrado;
        }
        char primero = text.charAt(0);
        if(Character.isLetter(primero)){
        filtrado= filtrado + primero;
        }
        
        String restaLetra=text.substring(1);
        String cadenaFiltrada= filtraLetras(restaLetra);
        String resultado= filtrado + cadenaFiltrada;
        return resultado;
    }
    public static void divisionString(String text){
        if (text.length() <= 1){
            System.out.printf("%4d: %s%n", text.length(), text);
        }else{
        String priMitad= text.substring(0, text.length()/2);
    /*2*/       divisionString(priMitad);
        String segMitad= text.substring(text.length()/2);
    /*3*/       divisionString(segMitad);
    
    /*1*/   System.out.printf("%4d: %s%n", text.length(), text);
            
            
        }
    }
}
