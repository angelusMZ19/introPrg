public class SumaPositius {
    public static void main(String[] args) {

        // creem la variable on guardarem el resultat de sumar
        int suma = 0;   // inicialment no hem sumat res i per tant és 0

        // declarem la variable que contindrà els valors llegits
        int valor;

        // processem el primer valor
        System.out.println("Introdueix el primer valor");
        valor = Integer.parseInt(Entrada.readLine());
        if (valor >= 0) {
            suma = suma + valor;
            }
                  if (valor < 0){
                 System.out.println("la suma és 0");}

            // processem el segon valor
            System.out.println("Introdueix el segon valor");
            valor = Integer.parseInt(Entrada.readLine());
            if (valor >= 0) {
                suma = suma + valor;
                }
                  if (valor < 0){
                 System.out.println("la suma és 0");}
                
                System.out.println("Introdueix el tercer valor");
                valor = Integer.parseInt(Entrada.readLine());
                if (valor >= 0) {
                suma = suma + valor;
                 }
                  if (valor < 0){
                 System.out.println("la suma és 0");
            }
             // mostrem el resultat
        System.out.println("La suma és " + suma);
        }
       
    }

