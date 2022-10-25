/*
*/
public class Ascensor{
    public static void main (String []args){
        
        System.out.println("pis?");
        String pis = Entrada.readLine();
        
        
        System.out.println("botó?");
        String botó = Entrada.readLine();
        
        if(pis.equals("planta baixa") && botó.equals("pujar un")) {
            System.out.println("primer pis");
            }else if(pis.equals("planta baixa") && botó.equals("pujar dos")) {
                System.out.println("segon pis");}
                
        if(pis.equals("primer pis") && botó.equals("pujar un")) {
            System.out.println("segon pis");}
            else if(pis.equals("primer pis") && botó.equals("baixar un")) {
                System.out.println("planta baixa");}
     }
}
