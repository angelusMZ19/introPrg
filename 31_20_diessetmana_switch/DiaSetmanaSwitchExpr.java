/*
*angelo montenegro
*voy avanzando
*/

public class DiaSetmanaSwitchExpr {
    public static void main(String[]args){
       
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
            
        }
        if ( diaSemana < 1 || diaSemana> 7){ 
            System.out.println("Error");}
   }
}
        
          
