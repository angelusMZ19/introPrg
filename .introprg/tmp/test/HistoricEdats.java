public class HistoricEdats{
    public static void main (String[]args){
    
   System.out.println("El vostre nom?");
    String nombre = Entrada.readLine();
            
   System.out.println("La vostra edat?");
    int edat = Integer.parseInt(Entrada.readLine());
   
   System.out.println("L'any actual?");
    int any = Integer.parseInt(Entrada.readLine());
   
    int anyNacer= any - edat;
    int edad= 1;
    if (edat > 0){
        System.out.println("El " + anyNacer + " vau néixer");
        System.out.println("El " + (anyNacer + 1) + " teníeu 1 any");
    
       for (int anySecuencia = anyNacer +2 ;
            anySecuencia < any;
            anySecuencia = anySecuencia + 1){
            edad= edad +1; 
      
                System.out.println("El " + anySecuencia + " teníeu " + (edad) + " anys ");}
        }else{
        System.out.println("Adéu " + nombre);}
    }
 }
