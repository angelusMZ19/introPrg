public class NotaMitja {
    public static void main(String[]args){
     // creem la variable on guardarem el resultat de sumar
        double suma = 0;   // inicialment no hem sumat res i per tant és 0
        double  promedio =  0.0  ;
        double n = 0;
        double secuencia= 1;
        
        // demana el primer valor
        System.out.println("Introdueix un valor");       
        double valor = Double.parseDouble(Entrada.readLine());             
                       
        // ves sumant mentre el valor sigui positiu
        while (valor >= 0 && valor <= 100) {
        if (valor < 0 && valor >100){
            System.out.println("Cap nota vàlida introduïda");
                }else{ 
                    suma = suma + valor;
                    n= Math.abs (secuencia);
                    promedio= suma / n;
                    secuencia += 1;
                    
            // demana un nou valor
            
           
                System.out.println("Introdueix un valor");}
                    valor = Double.parseDouble(Entrada.readLine());           
            }
            
          System.out.println(" La mitja de les notes vàlides és " + promedio);
            }
           
           // mostrem el resultat
           
    }
     
         


