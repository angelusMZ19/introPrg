/*Desarrolla un programa que pida el nombre de una persona, su edad y el año actual, y escriba la edad que tenía esa persona cada año desde su nacimiento.
*/
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
    if(any > 1971 && edat >= 0 && (!(nombre.isEmpty()) && !(nombre.isBlank()))){
            if(edat != 0){
                if(edat == 1){
                    System.out.println("El " + anyNacer + " vau néixer");
                    }else{
                        System.out.println("El " + anyNacer + " vau néixer");
                        System.out.println("El " + (anyNacer + 1) + " teníeu 1 any");  
                            for (int anySecuencia = anyNacer +2 ;
                                anySecuencia < any;
                                anySecuencia = anySecuencia + 1){
                                edad= edad +1;
                                System.out.println("El " + anySecuencia + " teníeu " + (edad) + " anys");
                                }
                        }
                    }
                    System.out.println("Adéu " + nombre);
                 }else{
                     System.out.println("Entrada incorrecta");
                     }
                }
        }

