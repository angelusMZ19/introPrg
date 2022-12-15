/*
La nueva versión tendrá la misma salida que la original, pero el código del programa será más modular. En concreto, el módulo main() se encargará de obtener los datos de entrada, y nombrará un nuevo módulo llamado muestraInterval() que será quien realice realmente el trabajo de mostrar el intervalo.
*/
public class MostraInterval{
    public static void main (String[]args){

        System.out.println("text?");
        String text = Entrada.readLine();

        System.out.println( "inici?" ) ;
        int v1 = Integer.parseInt(Entrada.readLine());
                     
        System.out.println( "final?" ) ;
        int v2 =Integer.parseInt(Entrada.readLine());
        
        mostraInterval(text, v1, v2);
    }
    public static void mostraInterval(String text, int inici, int fi){
    
        if (inici < 0){
            inici = 0;
        }
        if (fi < 0){
            fi = 0;
        }
        if (fi > text.length()-1){
            fi = text.length()-1;
        }
        if (inici > text.length()-1){
            inici = text.length()-1;
        }
            if (inici< fi){
                for (int i= inici; i <= fi; i++){
                    System.out.println(text.charAt(i));
                }
            }else {
                for(int i= inici; i >= fi; i--){
                    System.out.println(text.charAt(i));
                }
            }
    }   
}
