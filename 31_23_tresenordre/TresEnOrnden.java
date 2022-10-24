/*
 * Programa que ordena dos nombres
 *Angelo Montenegro :v
 */
public class TresEnOrnden {
    public static void main(String[] args) {
       System.out.println("Primer?");
            int primer = Integer.parseInt(Entrada.readLine());
         
        System.out.println("Segon?"); 
            int segon = Integer.parseInt(Entrada.readLine());
       
        System.out.println("Tercer?"); 
            int tercer = Integer.parseInt(Entrada.readLine());
            
                if (primer < segon){
                    if (primer< tercer){
                        if (segon <tercer){
                         System.out.println( primer + "  ,  " + segon + "  ,  " + tercer);
                            }else{  
                            System.out.println( primer + "  ,  " + tercer + "  ,  " + segon);}
                     }
                 }
                 else {
                    if (segon < tercer){
                        if (primer < tercer){
                         System.out.println( segon + "  ,  " + primer + "  ,  " + tercer);}
                        else {
                         System.out.println( segon + "  ,  " + tercer + "  ,  " + primer);}
                      }
                    }
                            
                             if (tercer < primer){
                                 if (segon < primer){
                                  System.out.println( tercer + "  ,  " + segon + "  ,  " + primer);
                                  } else if (primer < segon){
                                     System.out.println( tercer + "  ,  " + primer + "  ,  " + segon);}
                                 }
                              }
            }

