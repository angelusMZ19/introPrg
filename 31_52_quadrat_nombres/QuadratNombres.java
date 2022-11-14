/*Escribe un programa que pida un entero positivo mayor que 0 y "dibuje" un cuadrado con los números del 1 hasta el valor de la entrada.
*Angelo Montenegro
*/
public class QuadratNombres{
    public static void main (String[]args){
    

    
    System.out.println("Valor final?");
    int valor = Integer.parseInt(Entrada.readLine());
    
    if (!(valor <= 0) && !(valor >= 10)){

            for (int fila = 1; fila <= valor; fila = fila + 1) {
                for (int columna = 1; columna <= valor; columna= columna + 1)
                    System.out.print(" " + columna);
                    
                    System.out.println( );}
     }else{
        System.out.println("Valor inadequat");}
  }
}

