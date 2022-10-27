public class Lloro {
    public static void main(String[] args) {
       
       String paraula = "hola";
      
          
        while (!(paraula.isEmpty()) && !(paraula.isBlank())) {
        System.out.println("El lloro espera paraula:");
        paraula= Entrada.readLine();

           if(!(paraula.isEmpty()) && !(paraula.isBlank())){
            System.out.println("El lloro repeteix: " + paraula);
            
           }          
        }
     System.out.println ("Adéu");
    }
}
