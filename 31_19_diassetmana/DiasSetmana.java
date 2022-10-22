/*angelo
*tenga fe poco a poc voy avanzando 
*/
public class DiasSetmana {
    public static void main(String[]args){
    System.out.println("Inserte Nº dia de la setmana:");
    
    int diaSemana = Integer.parseInt(Entrada.readLine());
    
    if (diaSemana == 1){
        System.out.println("El numero seleccionado corresponde al dia Lunes");
        }else if (diaSemana == 2){
            System.out.println("El numero seleccionado corresponde al dia Martes");
            }else if (diaSemana == 3){
                System.out.println("El numero seleccionado corresponde al dia Miercoles");
                }else if (diaSemana == 4){
                    System.out.println("El numero seleccionado corresponde al dia Jueves");
                    }else if (diaSemana == 5){
                        System.out.println("El numero seleccionado corresponde al dia Viernes");
                        }else if (diaSemana == 6){
                            System.out.println("El numero seleccionado corresponde al dia Sabado");
                            }else if (diaSemana == 7){
                                System.out.println("El numero seleccionado corresponde al dia Domingo");
                                } else if (diaSemana < 1 || diaSemana> 7){
                                System.out.println("ERROR");
                                }
   }
}
        
           
