/*Programa que imprime la cantidad de columnas y filas dependiendo de la cantidad de numero que se introduzca en el args()
*/
public class Quadrat {
    public static void main (String[]args){
    
        int numero = Integer.parseInt(args[0]);
        // dibuixa un quadrat
            for (int linia=1; linia <= numero; linia++) {
                // dibuixa una línia
                for (int columna=1; columna <= numero; columna++) {
                    // dibuixa un element de la línia
                    System.out.print(" X");
                }
                // dibuixa un salt de línia
                System.out.println("");
            }
            System.out.println("");
    }
}

