/*
en esta ocasion se realizara un programa que se pueda jugar al tres en raya, el juego finalizara en estos casos, se introduce un valor erroneo en las posiciones donde el jugador colocara su marca, el jugador abandona, o uno de los dos jugadores gana la partida
la partida se gana si se realiza un tres en raya , aunque tambien puede haber un empate; 
en caso de que uno de lso jugadores seleciones las cordenadas de la marca del otro juagdor este debera recibir un "ocupado"
que comiece el juego y que la suerte este de vuestro lado 
ejercicio siguiendo la plantilla
*/

public class TresEnRatlla {
//modulos de soporte
    public static void mostraTaulell(char[][] taulell){
    for(int fil= 0; fil < taulell.length; fil++) {
        for(int col= 0; col < taulell.length; col++){
            System.out.print(taulell[fil][col]);
        }
        System.out.println();
      }
    }
    public static boolean casellaOcupada(char[][]taulell, int fila, int columna){
        if (taulell[fila][columna] == '·'){
            return false;
        }else{
            return true;
        }
    }
    public static boolean jugadorGuanya(char[][]taulell, char jugador){
        for(int i= 0; i < taulell.length; i++){
            /**/if(taulell[i][0] == jugador && taulell[i][1] == jugador && taulell[i][2] == jugador){
                return true;
            }
            if(taulell[0][i] == jugador && taulell[1][i] == jugador && taulell[2][i] == jugador){
                return true;
            }
        }
        //combinacion para ganar con el relleno en diagonal '\'
        if (taulell[0][0] == jugador && taulell[1][1] == jugador && taulell[2][2] == jugador){
                return true;
        }
        if(taulell[0][2] == jugador && taulell[1][1] == jugador && taulell[2][0] == jugador){
                return true;
        }
        return false;
        }
    public static boolean hiHaEmpat(char[][]taulell){
        for(int fila= 0; fila < taulell.length; fila++){
            for(int col= 0; col < taulell.length; col++){
                if(taulell[fila][col]=='·'){
                    return false;
                }else{
                    continue;
                }
            }
        }
        return true;
    }
   public static void main(String[] args){
        boolean joc= true;
        char[][] taulell = new char[3][3];
        System.out.println("Comença el joc");
            taulell [0][0] = '·';
            taulell [0][1] = '·';
            taulell [0][2] = '·';
            taulell [1][0] = '·';
            taulell [1][1] = '·';
            taulell [1][2] = '·';
            taulell [2][0] = '·';
            taulell [2][1] = '·';
            taulell [2][2] = '·';
            
        char jugadorActivo= 'X';
        
        while(joc){
        mostraTaulell(taulell);
        //recibe coordenadas del movimiento del jugador activo
        System.out.println(jugadorActivo + "?");
        String posicion = Entrada.readLine();
            
            //comprobar si el jugador activo a abandonado la partida
            if(posicion.equals("a")){
                System.out.println(jugadorActivo + " abandona");
                return;
            }
            //identifica las coordenadas del movimeinto del jugador
            int fila= Character.getNumericValue(posicion.charAt(0));
            int columna= Character.getNumericValue(posicion.charAt(1));
            
            //comprueba si las coordenadas estan o no ocupadas por un movimiento
            if(casellaOcupada(taulell, fila, columna)){
                System.out.println("Ocupada");
                continue;
            }
            //procede con el movimiento
            taulell[fila][columna]= jugadorActivo;
            
            if(jugadorGuanya(taulell, jugadorActivo)){
                mostraTaulell(taulell);
                System.out.printf("%c guanya\n", jugadorActivo);
                break;
            }
            //empate sí
            if (hiHaEmpat(taulell)){
                System.out.println("empat");
                break;
            }
            //intercambio del turno del jugadorActivo
            if(jugadorActivo == 'X'){
                jugadorActivo ='O';
            }else{
                jugadorActivo = 'X';
            }
        }
    }
}
