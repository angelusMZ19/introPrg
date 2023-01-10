/*
En aquest exercici consisteix en fer un programa que analitzi els arguments que es passen per la línia de comandes i distingeixi si són o no enters.
*/
public class Arguments{
    public static void main (String[]args){
        boolean numero= true;
        
        if (args.length > 0){
            for (int i = 0; i < args.length; i++) {
                numero= UtilString.esEnter(args);
                if( args = numero){
                    System.out.println("[" + i + " ]: " + "és enter");
                }else{
                    System.out.println("[" + i + " ]: " + " no és enter");
                }
            }
        }else {
            System.out.println("Cap argument");
        }
    }
}
