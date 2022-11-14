/*Desenvolupa un programa que vagi demanant enters positius i que, en el moment que rebi un de negatiu, mostri el valor màxim positiu introduït i finalitzi l'execució.
*/
public class TrobaMaxim{
    public static void main(String[] args) {
        int valor = 0; 
        int maxim = 0;
        while (valor >= 0 ) {
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
             if (valor > maxim) {
                maxim = valor;
               
                
                }
               
            }
            System.out.println("El màxim és " + maxim);
        }
        
    }

