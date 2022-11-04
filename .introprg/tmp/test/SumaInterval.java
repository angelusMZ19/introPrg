/*
*/
public class SumaInterval{
    public static void main (String[]args){
        
    
     System.out.println( "inici?" ) ;
     int v1 = Integer.parseInt(Entrada.readLine());
                 
     System.out.println( "final?" ) ;
     int v2 =  Integer.parseInt(Entrada.readLine());
        
         
     int acumulador = 0;
         
        if (v1 < v2) {
        for(int i = v1; i <= v2 ; i++) {
        acumulador = acumulador + i;
            }
            System.out.println( acumulador );
            }else if (v1 > v2){
                for(int i = v1; i >= v2 ; i--) {
                acumulador = acumulador + i;
                }
                System.out.println( acumulador );
             
         }
 }
}
 
