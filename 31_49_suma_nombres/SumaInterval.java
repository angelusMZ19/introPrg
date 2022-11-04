/*
*/
public class SumaInterval{
    public static void main (String[]args){
        
    
     System.out.println( "Valor inicial?" ) ;
     int n1 = Integer.parseInt(Entrada.readLine());
                 
     System.out.println( "Valor Final? " ) ;
     int n2 =  Integer.parseInt(Entrada.readLine());
        
         
     int acumulador = 0;
         
        if (n1 < n2) {
        for(int i = n1; i <= n2; i++) {
        acumulador = acumulador + i;
            }
            System.out.println("La suma total és " + acumulador + ".");
            } else {
              System.out.println("n2 no es mayor que n1!");
         }
    }
 }
