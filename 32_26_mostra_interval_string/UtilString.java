/*
Programa en modo de funcion que devuelve un pedazo de string obtenidos de los parametros cadena de texto , valor inciial, y falor final 
*/
public class UtilString{
    public static String intervalString (String text, int inici, int fin ){
        String buit= "";
        
        if (inici < 0){
            inici = 0;
        }
        if (fin < 0){
            fin = 0;
        }
        if (fin > text.length()-1){
            fin = text.length()-1;
        }
        if (inici > text.length()-1){
            inici = text.length()-1;
        }
            if (inici < fin){
                for (int i= inici; i <= fin; i++){
                    buit= buit + text.charAt(i);
                }
            }else {
                for(int i= inici; i >= fin; i--){
                    buit= buit + text.charAt(i);
                }
                
            }
            return buit;
    }
}
