/*programam que imprime el dia de la semna aal que corresponde el numero ingresado
*/

public class DiaSetmanaSwitch {
    public static void main(String[]args){
  
    //System.out.println("Inserte Nº dia de la setmana:");*/
    int diaSemana = Integer.parseInt(args[0]);
    
   
        switch (diaSemana){
            case 1 : 
                System.out.println("Dilluns");
                break;
            case 2 : 
                System.out.println("Dimarts");
                break;
            case 3 : 
                System.out.println("Dimecres");
                break;
            case 4 : 
                System.out.println("Dijous");
                break;
            case 5 : 
                System.out.println("Divendres");
                break;
            case 6 : 
                System.out.println("Dissabte");
                break;
            case 7 : 
                System.out.println("Diumenge");
                break;
            default:
                System.out.println("Error");
            }
             
         
        }
        
   }

        
          
