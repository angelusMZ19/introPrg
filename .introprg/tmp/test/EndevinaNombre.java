public class EndevinaNombre {
     public static void main(String[]args){
     
     int numPensado = 42;
     int valor = 0;
     System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
     System.out.println("Introdueix un valor");
        valor = Integer.parseInt(Entrada.readLine());
        
     while (valor != 42) {
          
            if (valor < numPensado) {
              System.out.println("És més gran que " + valor) ;
               
                System.out.println("Introdueix un valor");
                valor = Integer.parseInt(Entrada.readLine());
           
                    if (valor > numPensado) {
                    System.out.println("És més petite que " + valor) ;
              
                        System.out.println("Introdueix un valor");
                        valor = Integer.parseInt(Entrada.readLine());   
           
                         
                        
                      }   
                    }
                    
                 }
                 if (valor == numPensado) 
                         System.out.println("Has encertat!") ;        
                 
       }
}
 
   
   
