/*
en esta ocasion se realizara un programa que se pueda jugar al tres en raya, el juego finalizara en estos casos, se introduce un valor erroneo en las posiciones donde el jugador colocara su marca, el jugador abandona, o uno de los dos jugadores gana la partida
la partida se gana si se realiza un tres en raya , aunque tambien puede haber un empate; 
en caso de que uno de lso jugadores seleciones las cordenadas de la marca del otro juagdor este debera recibir un "ocupado"
que comiece el juego y que la suerte este de vuestro lado 
*/

public class TresEnRatlla {
    public static void main(String[] args){
        
         // declaració del taulell
        char[][] taulell = new char[3][3];

        // inicialització de la fila '·'
        taulell[0][0] = '·';
        taulell[0][1] = '·';
        taulell[0][2] = '·';

        taulell[1][0] = '·';
        taulell[1][1] = '·';
        taulell[1][2] = '·';
    
        taulell[2][0] = '·';
        taulell[2][1] = '·';
        taulell[2][2] = '·';
        /*char[][] taulell= {'·','·', '·'*/
        
        
        System.out.println("Comença el joc");
        mostrataula(taulell);
        System.out.println("X?");
    }
    public static void mostrataula(char[][] taulell){
    for (int fil = 0; fil < 3; fil++) {
        /*for(int col= 0; col < 3; col++)*/
            System.out.println(taulell[fil]);
        }
        System.out.println();
    }
}
