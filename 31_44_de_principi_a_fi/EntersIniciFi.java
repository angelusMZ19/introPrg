/*Desarrolla un programa que solicite tres números enteros, y escriba los valores entre el primero y el segundo saltando de uno al siguiente con el tercero.
*/
public class EntersIniciFi{
    public static void main (String[]args){
    
    
 
    
    System.out.println("Valor inicial?");
    int v1 = Integer.parseInt(Entrada.readLine());
    
    System.out.println("Valor final?");
    int v2 = Integer.parseInt(Entrada.readLine());
    
    System.out.println("Salt?");
    int v3 = Integer.parseInt(Entrada.readLine());
    
    System.out.println(v1);
    while(v1 < v2 && v2 > v3 && v3 > 0){
            v1= v1 + v3;
            
     System.out.println(v1);
            }
        }
    }

     
     
     /*int numero = 1;         // esta es la variable de recorrido asignandole un valor 
        while (numero <= 10) {  // la condicion que al cumplorse eejcutara los valores hasta llegar al limite que es el 10 
            System.out.println(numero); //impresion de los numeros 
            numero = numero + 1;    // imprimira los numeros de un en uno debido a que se le suma uno 
        }
    }
}
     */
    
    
