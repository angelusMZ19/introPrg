/*
En esta ocasión, el programa será capaz de mostrar un carácter diferente de Xa partir de lo que main()reciba enargs[1] - 
Por simplificar, presupondremos también que siempre nos dan este segundo argumento y que nos quedaremos con el primer carácter.
*/

public class Quadrat {
    public static void main(String[] args) {
        int costat = Integer.parseInt(args[0]);
        char caracter = args[1].charAt(0);
        dibuixaQuadrat(costat, caracter);
    }

    public static void dibuixaQuadrat(int costat, char caracter) {
        for (int linia=1; linia <= costat; linia++) {
            dibuixaLinia(costat, caracter);
            System.out.println(" ");
        }
    }

    public static void dibuixaLinia(int costat, char caracter) {
        for (int columna=1; columna <= costat; columna++) { 
            System.out.print("" + caracter);
        }
    }
}

