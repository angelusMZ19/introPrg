/*
*angelo montenegro
*voy avanzando
*/

public class diasSetmana_switch {
    public static void main(String[]args){
    System.out.println("Inserte Nº dia de la setmana:");
    
    int diaSemana = Integer.parseInt(Entrada.readLine());
    
    switch (diaSemana){
        case 1 : 
            System.out.println("El numero seleccionado corresponde al dia Lunes");
            break;
        case 2 : 
            System.out.println("El numero seleccionado corresponde al dia Martes");
            break;
        case 3 : 
            System.out.println("El numero seleccionado corresponde al dia Miercoles");
            break;
        case 4 : 
            System.out.println("El numero seleccionado corresponde al dia Jueves");
            break;
        case 5 : 
            System.out.println("El numero seleccionado corresponde al dia Viernes");
            break;
        case 6 : 
            System.out.println("El numero seleccionado corresponde al dia Sabado");
            break;
        case 7 : 
            System.out.println("El numero seleccionado corresponde al dia Domingo");
            break;
            
        }
        if ( diaSemana < 1 || diaSemana> 7){ 
            System.out.println("ERROR");}
   }
}
        
          
