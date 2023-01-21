/*SIN USAR FOR , WHILE, DO WHILE
En aquesta ocasió, desenvoluparàs un programa que obtindrà un text per entrada estàndard i mostrarà per sortida estàndard totes les subcadenes possibles, tenint en comptes només les lletres.
Per mostrar l'ordre requerit per aquest exercici, caldrà que implementis el següent algorisme recursiu:
Si la cadena d'entrada té una longitud menor o igual a 1, es mostra la cadena sencera i s'acaba
Si la cadena té una longitud més gran que 1, llavors:
    1- Primer es mostra la cadena
    2- Després es mostra les subcadenes corresponents a la primera meitat de la cadena
    3- Finalment es mostra les subcadenes corresponents a la resta de la cadena
    
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
    /*1*/   System.out.printf("%4d: %s%n", text.length(), text);
            String priMitad= text.substring(0, text.length()/2);
    /*2*/       divisionString(priMitad);
            String segMitad= text.substring(text.length()/2);
    /*3*/       divisionString(segMitad);
        }
    }
}
