/*Programa que da la la media de los valorres ingresado es decir la nota promedio
*/
public class NotaMitja {
    public static void main(String[]args){
     // creem la variable on guardarem el resultat de sumar
        int suma = 0;   // inicialment no hem sumat res i per tant és 0
        int promedio = 0;
        int valor = 0;
        int contador= 1;
        
        // demana el primer valor
        System.out.println("Introdueix un valor");       
        valor = Integer.parseInt(Entrada.readLine());   
        
       if(valor < 0 || valor > 100){
                System.out.println("Cap nota vàlida introduïda");  
        }else {
         suma= suma +valor;
        // ves sumant mentre el valor sigui positiu
        while (valor >= 0 && valor <= 100) {
            System.out.println("Introdueix un valor");
                valor = Integer.parseInt(Entrada.readLine());
            if (valor >= 0 && valor <= 100){
                suma = suma + valor;
                contador= contador + 1;
            }
        }
        promedio= suma / contador;
        System.out.println("La mitja de les notes vàlides és " + promedio);
         }
    }
}

