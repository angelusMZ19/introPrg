public class EndevinaNombre{
    public static void main (String[]args){
    
    int valor = 0;
    int numPensado = 42;
    
    System.out.println("Introdueix un valor");
    valor = Integer.parseInt(Entrada.readLine());
    
    while(valor >= 0 && valor <= 100){
        if (valor == 42){ 
        System.out.println("Has encertat");
        
         System.out.println("Introdueix un valor");
         valor = Integer.parseInt(Entrada.readLine());        
         }else if(valor <= 0){
         System.out.println("Com minim 1");
            
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            }else if(valor > 100){
            System.out.println("Com maxim 100");
                    
                    System.out.println("Introdueix un valor");
                    valor = Integer.parseInt(Entrada.readLine());
                    }else if(valor < numPensado){
                    System.out.println("es mes gran que " + valor);
                        
                        System.out.println("Introdueix un valor");
                        valor = Integer.parseInt(Entrada.readLine());
                        }else if(valor > numPensado){
                         System.out.println("Es mes petite que " + valor);
                           }
                         }                          
                     }
                 
             }
             

            
