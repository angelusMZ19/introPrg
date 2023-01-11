/*
programa que valida si el valor introducido es un entero o no, en caso de no serlo , el valor a regresar sera un false por afirmando esta negacion, por lo contrario el valor es entero regresara un true y volvera a evaluar el sigueinte valor
*/
public class UtilString{
    public static boolean esEnter(String text){
        char mas ='+';
        char menos='-';
        int longitud = text.length();
        boolean numero= true;
            if (!text.isEmpty()){
                for(int i =0; i < longitud-1; i++){
                    if (!Character.isDigit(text.charAt(i))){
                        if (!(i==0 && (text.charAt(0)== mas || text.charAt(0)== menos))){
                         numero = false;
                        }
                    }
            }
        }else {
         numero= false;
        }
        return numero;
    }
}
