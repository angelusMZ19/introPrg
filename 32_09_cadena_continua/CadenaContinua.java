/*
Desenvolupa un programa que demani un text i un nombre enter, i mostri tants caràcters del text com indiqui el nombre enters, començant pel primer. En cas que en faltin, el programa tornarà a mostrar el text a partir del primer caràcter fins que hagi aconseguit tots els caràcters demanats.

En cas que se li demani menys d'un caràcter, simplement no mostrarà res. En cas que el text introduït sigui buit, mostrarà el missatge "error" finalitzarà l'execució sense demanar la longitud de la cadena a generar.
*/
public class CadenaContinua{
    public static void main(String[]args){
    
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        System.out.println("Nombre?");
        int n = Integer.parseInt(Entrada.readLine());
            
            if(n > text.length()){
                n= text.lenght
            if(n <= text.length()){
                for (int i = n; i >= text.length(); i++){
                    System.out.println(text.charAt(i));
                }
            }
            if (n > text.length()){
                for(int i = n; i <= n; i++){
                    System.out.println(text.charAt(i));
                }
            }
            if (text.isEmpty() && text.isBlank()){
                System.out.println("Error");
            }
    }
}
