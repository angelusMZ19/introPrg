/*El programa anirà demanant notes mentre les que rebi siguin valors entre el 0 i el 100. Un cop rebi un valor fora del rang, deixarà de demanar més i mostrarà el valor resultant.
*/

public class SumaNotes {
    public static void main(String[] args) {

        // creem la variable on guardarem el resultat de sumar
        int suma = 0;   // inicialment no hem sumat res i per tant és 0

        // demana el primer valor
        System.out.println("Introdueix una nota");
        int valor = Integer.parseInt(Entrada.readLine());

        // ves sumant mentre el valor sigui positiu
        while (valor >= 0 && valor <= 100) {
            suma = suma + valor;
            // demana un nou valor
            System.out.println("Introdueix una nota");
            valor = Integer.parseInt(Entrada.readLine());
        }

        // mostrem el resultat
        System.out.println("La suma de les notes vàlides és " + suma);
    }
}
