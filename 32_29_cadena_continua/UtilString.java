/*en este ejercicio se usara dos funciones que estaran adjuntas dentro de un mismo archivo denominado utilString pero con dos modulos diferentes
cadena continua retorna un pedazo de string y el es enter retorna un valor booleano para verificar que el valor introducido sea un numero y no una letra
*/
public class UtilString{
    public static String cadenaContinua(String text, int longitud){
       /**/ String resultat= "";
        int dif= 0;
        int resultado= 0;
        String numCadena= String.valueOf(longitud);
        if(!(numCadena.isEmpty())|| !(numCadena.isBlank())){
            if(!(longitud<= 0) && longitud > text.length()){
                resultado =  longitud/text.length();
                dif= longitud-(text.length() * resultado);
                System.out.println(text.repeat(resultado) + text.substring(0, dif));
            } else if(longitud == 1){
                longitud = 0;
                for (int i= 0; i<= longitud; i = i +1){
                   /**/ resultat= resultat + text.charAt(i);
                }
            } else if (longitud > 1){
                for (int i= 0; i<= longitud-1; i = i +1){
                   /**/ resultat= resultat + text.charAt(i);
                }
            } else{
                for (int i= 1; i<= longitud; i = i +1){
                   /**/ resultat= resultat + text.charAt(i);
                }
            }
        }
    return resultat;
    }

    public static boolean esEnter(String text){
        char mas ='+';
        char menos='-';
        char espai= ' ';
        int longitud = text.length();
        boolean numero= true;
            if (!text.isEmpty()){
                for(int i =0; i < longitud-1; i++){
                    if (!Character.isDigit(text.charAt(i))){
                        if (!(i==0 && (text.charAt(0)== mas || text.charAt(0)== menos || text.charAt(0)== espai))){
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

