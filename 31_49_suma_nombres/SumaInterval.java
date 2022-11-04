/*
*/
public class SumaInterval{
    public static void main (String[]args){
        
    
     System.out.println( "inici?" ) ;
     int n1 = Integer.parseInt(Entrada.readLine());
                 
     System.out.println( "final? " ) ;
     int n2 =  Integer.parseInt(Entrada.readLine());
        
         
     int acumulador = 0;
         
        if (n1 < n2) {
        for(int i = n1; i <= n2; i++) {
        acumulador = acumulador + i;
            }
            System.out.println( acumulador );
            } 
         }
 }
 
