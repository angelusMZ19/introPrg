/*
*/
public class SumaEnters{
    public static void main (String[]args){
        
        if (args.length > 0){
            for (int i = 0; i < args.length; i++) {
                String text= args[i];
                boolean numero= UtilString.esEnter(text);
                if(numero== true){
                    System.out.println("[" + i + "] "+ "\""+text +"\""+ ": " + "és enter"); 
                }else{
                    System.out.println("[" + i + "] "+ "\""+text +"\""+ ": " + "no és enter");
                }
            }
        }else {
            System.out.println("Cap argument");
        }
    }
}
