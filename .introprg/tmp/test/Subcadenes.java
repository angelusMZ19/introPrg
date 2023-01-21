/*SIN USAR FOR , WHILE, DO WHILE
En esta ocasión, desarrollarás un programa que obtendrá un texto por entrada estándar y mostrará por salida estándar todas las subcadenas posibles, teniendo en cuenta sólo las letras.
Para mostrar el orden requerido por este ejercicio, deberás implementar el siguiente algoritmo recursivo:
Si la cadena de entrada tiene una longitud menor o igual a 1, se muestra la cadena entera y se termina

Si la cadena tiene una longitud mayor que 1, entonces:
    1_Primero se muestran las subcadenas correspondientes a la primera mitad de la cadena
    2_A continuación se muestran las subcadenas correspondientes al resto de la cadena
    3_Por último se muestra la cadena
*/
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
    /*1*/   System.out.printf("%4d: %s%n", text.length(), text);
        String segMitad= text.substring(text.length()/2);
    /*3*/       divisionString(segMitad);
   
        }
    }
}
