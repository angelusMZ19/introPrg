/*
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
