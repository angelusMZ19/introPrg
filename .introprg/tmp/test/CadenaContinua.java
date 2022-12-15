/*
Desenvolupa un programa que demani un text i un nombre enter, i mostri tants caràcters del text com indiqui el nombre enters, començant pel primer. En cas que en faltin, el programa tornarà a mostrar el text a partir del primer caràcter fins que hagi aconseguit tots els caràcters demanats.

En cas que se li demani menys d'un caràcter, simplement no mostrarà res. En cas que el text introduït sigui buit, mostrarà el missatge "error" finalitzarà l'execució sense demanar la longitud de la cadena a generar.
*/
public class CadenaContinua{
    public static void main(String[]args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        if(!(text.isEmpty())|| !(text.isBlank())){
            System.out.println("Nombre?");
            int longitud = Integer.parseInt(Entrada.readLine());
        mostraCadenaContinua(text, longitud);
        }else{
            System.out.println("error");
        }
    }
    public static void mostraCadenaContinua(String text, int longitud){
        int dif= 0;
        int resultado= 0;
        String numCadena= String.valueOf(longitud);
        if(!(numCadena.isEmpty())|| !(numCadena.isBlank())){
            if(!(longitud<= 0) && longitud > text.length()){
                resultado =  longitud/text.length();
                dif= longitud-(text.length() * resultado);
                System.out.println(text.repeat(resultado) + text.substring(0, dif));
            } else if(longitud == 1){
                longitud = 0;
                for (int i= 0; i<= longitud; i = i +1){
                    System.out.print(text.charAt(i));
                }
            } else if (longitud > 1){
                for (int i= 0; i<= longitud-1; i = i +1){
                    System.out.print(text.charAt(i));
                }
            } else{
                for (int i= 1; i<= longitud; i = i +1){
                    System.out.print(text.charAt(i));
                }
            }
        }else{
           System.out.println("error");
        }
    }
}

