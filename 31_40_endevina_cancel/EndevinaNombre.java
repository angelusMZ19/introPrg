/* olvemos al ejercicio que implementaba el juego de adivinar
En esta ocasión vamos a desarrollar una nueva versión que mejorará el ejercicio.
La versión anterior obligaba a los usuarios a acertar para poder finalizar.
Esta nueva versión ofrece la posibilidad de salir del juego al introducir una cadena vacía (recuerda isEmpty()). Cuando los usuarios entren la cadena vacía, el programa responderá con el mensaje "Cancelado!" y finalizará.*/

public class EndevinaNombre{
    public static void main (String[]args){
    
    int valor = 0;
    String numCadena= String.valueOf(valor);
    int numPensado = 42;
    
    
    System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
    System.out.println("Introdueix un valor");
    valor = Integer.parseInt(Entrada.readLine());
    
    
       
       if(!(numCadena.isEmpty()) && !(numCadena.isBlank())){ 
                
        while(valor != 42){ 
         
         
         if(valor <= 0){
         System.out.println("Com a mínim 1");
            
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            }else if(valor > 100){
            System.out.println("Com a màxim 100");
                    
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
               System.out.println("Cancelat");                        
    }
}        
