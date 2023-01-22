/*
El programa CadenaContinuahará lo prácticamente lo mismo que la versión original pero los cálculos los realizará una función llamada cadenaContinua()

Sin embargo, la nueva versión será capaz de controlar el caso en que no introduzcan un número entero por la longitud de la cadena resultante.
El programa CadenaContinuahará lo prácticamente lo mismo que la versión original pero los cálculos los realizará una función llamada cadenaContinua()

Sin embargo, la nueva versión será capaz de controlar el caso en que no introduzcan un número entero por la longitud de la cadena resultante.

en este ejercicio se usara dos funciones que estaran adjuntas dentro de un mismo archivo denominado utilString pero con dos modulos diferentes
*/
public class CadenaContinua{
    public static void main(String[]args){
    
        System.out.println("Text?");
        String text = Entrada.readLine();
        /*text = text.strip();*/
        if(!(text.isEmpty()) && !(text.isBlank())){
            System.out.println("Nombre?");
            String longitud = Entrada.readLine();
            longitud = longitud.strip();
             
            boolean enter= UtilString.esEnter(longitud);

            //System.out.println(enter);
            if(enter){
            int valor= Integer.parseInt(longitud);/**/
            String resultat = UtilString.cadenaContinua(text, valor);
            System.out.println(resultat.strip());
            }else{
                System.out.println("ERROR");
                }
        }else{
        System.out.println("error");
        }
    }
}

