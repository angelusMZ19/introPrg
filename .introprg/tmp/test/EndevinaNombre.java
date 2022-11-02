public class EndevinaNombre{
    public static void main (String[]args){
    
    int valor = 0;
    int numPensado = 42;
    
    System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
    System.out.println("Introdueix un valor");
    valor = Integer.parseInt(Entrada.readLine());
    
    
        while(valor != 42){ 
        
         if(valor <= 0){
         System.out.println("Com mínim 1");
            
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            }else if(valor > 100){
            System.out.println("Com màxim 100");
                    
                    System.out.println("Introdueix un valor");
                    valor = Integer.parseInt(Entrada.readLine());
                    }else if(valor < numPensado){
                    System.out.println("És més gran que " + valor);
                        
                        System.out.println("Introdueix un valor");
                        valor = Integer.parseInt(Entrada.readLine());
                        }else if(valor > numPensado){
                         System.out.println("És més petit que " + valor);
                            
                            System.out.println("Introdueix un valor");
                            valor = Integer.parseInt(Entrada.readLine());
                            }
                            
                          }
                          System.out.println("Has encertat!");
              }                          
}
            
