/*Desenvolupa una versió del lloro que, com és tradicional, vagi demanant texts i els repeteixi fins que arribi un text en blanc o buit.

En aquesta versió, no obstant, si el text que rep és "dibuixa quadrat" o "dibuixa rectangle", en comptes de repetir el text, dibuixarà el quadrat o el rectangle corresponent.

En finalitzar, s'acomiadarà amb el tradicional "Adéu"
*/
public class LloroQuadrat{
    public static void main(String[]args){
    String paraula = "hola";
    
        while (!(paraula.isEmpty()) && !(paraula.isBlank())) {
        System.out.println("El lloro espera paraula:");
        paraula= Entrada.readLine();
            if(!(paraula.isEmpty()) && !(paraula.isBlank())){
                if(paraula.equals("dibuixa quadrat")){
                    dibuixaQuadrats();
                }   else if(paraula.equals("dibuixa rectangle")){
                        dibuixaRectangle();
                    }else{
                        System.out.println("El lloro repeteix: " + paraula);
                        }
                }
            }
     System.out.println ("Adéu");
    }

    public static void dibuixaQuadrats() {
        for (int linia=1; linia <= 5; linia++) {
            dibuixaLinia();
            
        }
        dibuixaQuadrat();
     }

    public static void dibuixaQuadrat() {
        System.out.println();
    }
    public static void dibuixaLinia() {
        for (int columna=1; columna <= 5; columna++) {
            // dibuixa un element de la línia
            System.out.print(" X");
        }
        System.out.println();   // finalitza la línia
    }
    public static void dibuixaRectangle(){

        for (int linia=1; linia <= 5; linia++) {
                    // dibuixa una línia
                    for (int columna=1; columna <= 10; columna++) {
                        // dibuixa un element de la línia
                        System.out.print(" X");
                    }
                    // dibuixa un salt de línia
                    System.out.println("");
        }
        System.out.println("");
    }
}
