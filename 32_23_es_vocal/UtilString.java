/*
progrmaa que es usado 
*//*
public class UtilString{
    public static String nomesLletres(String text){
        String nomesLletres = "";
        for(int i = 0; i < text.length(); i++){
            if(Character.isLetter(text.charAt(i))){
                nomesLletres = nomesLletres + text.charAt(i);
            }
        }
        return nomesLletres;
    }
    public static String lletresSeparades(String nomesLletres){
        String lletresSeparades= "";
        for(int i = 0; i < nomesLletres.length(); i++){
            if(nomesLletres.length() == 1){
                lletresSeparades = lletresSeparades + nomesLletres.charAt(i);
            } else {
                    if (i== nomesLletres.length() - 1){
                        lletresSeparades = lletresSeparades + nomesLletres.charAt(i);
                    } else {
                        lletresSeparades = lletresSeparades + nomesLletres.charAt(i) + ", ";
                }
            }
        }
        return lletresSeparades;
    }
}
*/
/*
public class UtilString{
    public static void esVocal(){

        String text = Entrada.readLine();
        char inici= text.charAt(0);
        char fin = text.charAt(text.length()-1);
        for(int i= 0 ; i <= text.length(); i++){
            if(inici== 'a'||inici== 'e'||
               inici== 'i'||inici== 'o'||
               inici== 'u'||inici== 'A'||
               inici== 'E'||inici== 'I'||
               inici== 'O'||inici== 'U'){
            return esVocal;
            }else{
                System.out.println("Error");
            }
        }
    }
}
*/


public class UtilString{
    public static void esVocal(String text){

        while(text.length() >= 1){
            if(text.charAt(0)== 'a'||text.charAt(0)== 'e'||
               text.charAt(0)== 'i'||text.charAt(0)== 'o'||
               text.charAt(0)== 'u'||text.charAt(0)== 'A'||
               text.charAt(0)== 'E'||text.charAt(0)== 'I'||
               text.charAt(0)== 'O'||text.charAt(0)== 'U'||
               text.charAt(text.length()-1)== 'a'||text.charAt(text.length()-1)== 'e'||
               text.charAt(text.length()-1)== 'i'||text.charAt(text.length()-1)== 'o'||
               text.charAt(text.length()-1)== 'u'||text.charAt(text.length()-1)== 'A'||
               text.charAt(text.length()-1)== 'E'||text.charAt(text.length()-1)== 'I'||
               text.charAt(text.length()-1)== 'O'||text.charAt(text.length()-1)== 'U'){
               
               System.out.println("el lloro diu: " + text);
            }
                System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
                text = Entrada.readLine();
        }
            System.out.println("Confirmacion");
            if(UtilitatsConfirmacio.respostaABoolean(Entrada.readLine())){
                System.out.println("Adeu");
                System.exit(0);
            }else{
                LloroVocalIniciFi();
            }
    }
}









