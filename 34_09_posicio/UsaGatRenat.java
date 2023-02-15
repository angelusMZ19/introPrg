/*
Modifica la definición de su clase para que pueda guardar 
esta información, haciendo que inicialmente el gato esté 
tumbado.

La información del estado la guardaremos en una propiedad
con el nombre posicioque será de tipo String.
*/
public class UsaGatRenat {
     public static void main(String[] args) {
         GatRenat renat;
         renat = new GatRenat();
         System.out.println("Vides inicials: " + renat.vides);
         System.out.println("Posició inicial: " + renat.posicio);
         renat.posicio="assegut";
         System.out.println("Posició final: " + renat.posicio);
     }
 }
