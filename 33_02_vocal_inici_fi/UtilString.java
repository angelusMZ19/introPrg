/*
util String 
*te da como resultado si empieza con vocal 
* o termina con vocal 
*/
public class UtilString{
    public static boolean esVocal(char caracter){
    String vocales= "àaèéeíïiòóoúüuÀAÈÉEÍÏIÒÓOÚÜU";
    boolean esVocal= false;
    for (int i =0; i< vocales.length(); i++){
        char vocal= vocales.charAt(i);
            if (vocal== caracter){
                esVocal = true;
                break;
            }
    }
    return esVocal;
    }
}


