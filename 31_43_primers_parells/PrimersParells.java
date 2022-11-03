//Desarrolla un programa que escriba los primeros números naturales que sean pares hasta el 10. Es decir: 2 4 6 8 … 10
public class PrimersParells{
    public static void main (String[]args){
        int numero = 2;         // esta es la variable de recorrido asignandole un valor 
        while (numero <= 10) {  // la condicion ejecutara valores hasta llegar al limite que es el 10 
            System.out.println(numero); //impresion de los numeros 
            numero = numero + 2;    // imprimira los numeros de dos en dos
        }
    }
}
