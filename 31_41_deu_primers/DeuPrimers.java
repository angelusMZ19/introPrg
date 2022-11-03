/*Desarrolla un programa que escriba los primeros 
10 números naturales. Es decir: 1 2 3…10
*/

public class DeuPrimers{
    public static void main (String[]args){
        int numero = 1;         // esta es la variable de recorrido asignandole un valor 
        while (numero <= 10) {  // la condicion que al cumplorse eejcutara los valores hasta llegar al limite que es el 10 
            System.out.println(numero); //impresion de los numeros 
            numero = numero + 1;    // imprimira los numeros de un en uno debido a que se le suma uno 
        }
    }
}
