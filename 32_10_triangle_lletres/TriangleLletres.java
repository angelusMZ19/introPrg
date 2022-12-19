/*
La nova versió tindrà la mateixa sortida que l'original però el codi del programa serà més modular. En concret, el mòdul main() se se n'encarregarà d'obtenir les dades d'entrada, i cridarà un nou mòdul anomenat dibuixaTriangle() que serà qui realitzi realment la feina de mostrar el triangle. De fet, aquest es recolzarà en un altre anomenat dibuixaLinia() que serà qui realment faci la feina de dibuixar cada línia del triangle.
*/
public class TriangleLletres{
    public static void main (String[]args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        public static void dibuixaTriangle(String text)
public static void dibuixaLinia(String text, int linia)
            for( int fila = 0; fila < text.length(); fila++){
                for (int col = 0; col <= fila ; col++){
                    System.out.print(text.charAt(col));
                    if(col != fila){
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
    }
}

