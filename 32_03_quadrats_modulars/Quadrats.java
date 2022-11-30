/* Programa que dibuixa un quadrat de 5x5 */

public class Quadrats {
    public static void main(String[] args) {
        System.out.println("Quants?");
        int quant = Integer.parseInt(Entrada.readLine());
        for(int i= 1; i <= quant; i++){
            dibuixaQuadrats();
        }
    }

    public static void dibuixaQuadrats() {
        for (int linia=1; linia <= 5; linia++) {
            dibuixaLinia();
        }
        dibuixaQuadrat();
     }

    public static void dibuixaQuadrat() {
        
    }
    public static void dibuixaLinia() {
        for (int columna=1; columna <= 5; columna++) {
            // dibuixa un element de la línia
            System.out.print(" X");
        }
        System.out.println();   // finalitza la línia
    }
}
