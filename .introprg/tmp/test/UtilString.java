/*
progrmaa que es usado 
*/
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
                        lletresSeparades = lletresSeparades + nomesLletres.charAt(i) + ",";
                }
            }
        }
        return lletresSeparades;
    }
}
