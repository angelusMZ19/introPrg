/*
En este ejercicio, vuelve a añadir la propiedad posicioque incorporaste al ejercicio Renat tiene posición . En esta ocasión, haz la propiedad privada e implementa los accesores de forma que garantices que la posición del Renat sea siempre correcta, a la vez que pueda ser cambiada.
*/
public class UsaGatRenat {
     public static void main(String[] args) {
         GatRenat renat = new GatRenat();
         System.out.println("Vides inicials: " + renat.getVides());
         System.out.println("Posició inicial: " + renat.getPosicio());
         System.out.println("Introdueix nova posició:");
         renat.setPosicio(Entrada.readLine());
         System.out.println("Posició final: " + renat.getPosicio());
     }
 }
