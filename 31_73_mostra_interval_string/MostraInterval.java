/*
En aquella ocasió el programa demanava els valors límit entre dos enters. Amb unes petites modificacions podríem crear un nou programa que ens permetés veure una secció d'un String

Doncs això és el que ens demana aquest exercici. En concret, l'enunciat és el següent: desenvolupa un programa que demani un text i dos valors enters, i que mostri tots els caràcters que hi ha entre el primer i el segon, en l'ordre marcat per l'entrada.

En cas que els valors enters quedin fora de les posicions del text introduït, el programa mostrarà tot el que es pugui sense queixar-se.
*/

public class MostraInterval{
    public static void main (String[]args){

        System.out.println("Text?");
        String text= Entrada.readLine();

        System.out.println( "inici?" ) ;
        int v1 = Integer.parseInt(Entrada.readLine());
                     
        System.out.println( "final?" ) ;
        int v2 =  Integer.parseInt(Entrada.readLine());
        
        text= text.length();
        
        if (v1 >= 0 || v2 > texto)
               for (int i = v1; i <= texto; i = i + 1){  
                 char act= valor.charAt(i);
                    System.out.println(i);
                }
        }
}

