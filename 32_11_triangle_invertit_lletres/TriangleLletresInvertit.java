/*
La nova versió tindrà la mateixa sortida que l'original però el codi del programa serà més modular. En concret, el mòdul main() se n'encarregarà d'obtenir les dades d'entrada, i cridarà un nou mòdul anomenat dibuixaTriangle() que serà qui realitzi realment la feina de mostrar el triangle. De fet, aquest es recolzarà en un altre anomenat dibuixaLinia() que serà qui realment faci la feina de dibuixar cada línia del triangle.
*/
public class TriangleLletresInvertit{
    public static void main(String[]args){
    
        System.out.println("Text?");
        String text = Entrada.readLine();

        dibuixaTriangleInvertit(text);
    }
    public static void dibuixaTriangleInvertit(String text){

        for(int fila= 0; fila <= text.length()-1; fila++){
            System.out.println("");
            dibuixaLiniaInvertida(text, fila);
        }
    }
    public static void dibuixaLiniaInvertida(String text, int linia){
            for(int col= (text.length()-1) - linia; col >= 0; col--){
                if(col == 0){
                    System.out.print(text.charAt(col));
                }else{
                    System.out.print( text.charAt(col) + ", " );
                }
            }
    }
}



