/*Desarrolla un programa que solicite dos valores enteros y muestre todos los enteros existentes entre el primero y el segundo, en el orden marcado por la entrada.*/

public class MostraInterval{
    public static void main (String[]args){
    
     System.out.println( "inici?" ) ;
     int v1 = Integer.parseInt(Entrada.readLine());
                 
     System.out.println( "final?" ) ;
     int v2 =  Integer.parseInt(Entrada.readLine());
                
        if (v1 < v2){
        for (int numero = v1;
             numero <= v2;
             numero = numero + 1) {  
             System.out.println(numero);}
           }else if (v1 > v2){ 
            for ( int numero = v1;     
                  numero >= v2;
                  numero = numero - 1) {   
                System.out.println(numero); }
                }else if (v1 == v2){
                     System.out.println(v1);}
                }      
  }
