/*
progrmaa que es usado para implementarse en el programa nomas lletres, ya que etse se usara para reconocer slo las letras y para separa las letras 
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
                        lletresSeparades = lletresSeparades + nomesLletres.charAt(i) + ", ";
                }
            }
        }
        return lletresSeparades;
    }
}
