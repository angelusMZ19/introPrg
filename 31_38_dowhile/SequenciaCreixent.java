public class SequenciaCreixent {
    public static void main (String[]args){
    
    double cantidad = 0;
    double acumulador = 0;
    double contador = 0;
    double promedio = 0;
    
    System.out.println("Introdueix un valor");       
        double valor = Double.parseDouble(Entrada.readLine());   
     
     while (valor >= 0 && valor <= 100){
         acumulador = acumulador + valor;
         contador++;
         cantidad  = contador+1;
          System.out.println("Introdueix un valor");
           valor = Double.parseDouble(Entrada.readLine()); 
           acumulador = acumulador + valor;
      
            promedio = acumulador / cantidad;
     
     }    
     System.out.println(" La mitja de les notes vàlides és " + promedio);
     
     }
 }
