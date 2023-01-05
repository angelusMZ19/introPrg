/*Desenvolupa un programa que vagi demanant enters positius i que, en el moment que rebi un de negatiu, mostri el valor màxim positiu introduït i finalitzi l'execució.
*/
public class NotaMesAlta{
    public static void main(String[] args) {
        int valor = 0; 
        int maxim = 0;
        System.out.println("Introdueix les notes (-1 per finalitzar)");
        int comptador= 0;
        while (valor >= 0 && valor <=10) {
            valor = Integer.parseInt(Entrada.readLine());
             if (valor > maxim) {
                maxim = valor;
                comptador += 1;
                }
               
            }
            if(comptador == 1){
                System.out.println("Com a mínim calen dues notes");
                }else{
                System.out.println("La nota més alta és " + maxim);
                }
    }
}

