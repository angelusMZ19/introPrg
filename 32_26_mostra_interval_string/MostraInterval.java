/*
--Recuperamos nuevamente el ejercicio que mostraba la sección de un String y hagamos su versión modular
El programa MostraIntervalhará prácticamente lo mismo que la versión
Es decir, ahora los caracteres resultantes aparecen en la misma línea.
-La operación de encontrar los caracteres en el intervalo la realizará una función llamada intervalString()con los parámetros: la cadena de texto correspondiente, el valor inicial y el valor final. La función devolverá la sección correspondiente del texto.
-intervalString()estará definida dentro de UtilString.javay será una función pura.
*/

public class MostraInterval{
    public static void main (String[]args){

        System.out.println("Text?");
        String text= Entrada.readLine();

        System.out.println( "inici?" ) ;
        int v1 = Integer.parseInt(Entrada.readLine());
                     
        System.out.println( "final?" ) ;
        int v2 =  Integer.parseInt(Entrada.readLine());
        /*
        if (v1 < 0){
            v1 = 0;
        }
        if (v2 < 0){
            v2 = 0;
        }
        if (v2 > text.length()-1){
            v2 = text.length()-1;
        }
        if (v1 > text.length()-1){
            v1 = text.length()-1;
        }
            if (v1< v2){
                for (int i= v1; i <= v2; i++){
                    System.out.print(text.charAt(i));
                }
            }else {
                for(int i= v1; i >= v2; i--){
                    System.out.print(text.charAt(i));
                }
                
            }
            System.out.println("");
            */
        String resultat = UtilString.intervalString(text, v1, v2);
        System.out.println(resultat);
    }
}
