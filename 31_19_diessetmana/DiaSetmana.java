/*angelo
*tenga fe poco a poc voy avanzando 
*/
public class DiaSetmana {
    public static void main(String[]args){
   
    int diaSemana = Integer.parseInt(args[0]);
    
    if (diaSemana == 1){
        System.out.println("Dilluns");
        }else if (diaSemana == 2){
            System.out.println("Dimars");
            }else if (diaSemana == 3){
                System.out.println("Dimecres");
                }else if (diaSemana == 4){
                    System.out.println("Dijous");
                    }else if (diaSemana == 5){
                        System.out.println("Divendres");
                        }else if (diaSemana == 6){
                            System.out.println("Disabta");
                            }else if (diaSemana == 7){
                                System.out.println("Diumenge");
                                } else if (diaSemana < 1 || diaSemana> 7){
                                System.out.println("Error");
                                }
   }
}
        
          
