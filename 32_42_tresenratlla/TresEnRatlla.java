/*
en esta ocasion se realizara un programa que se pueda jugar al tres en raya, el juego finalizara en estos casos, se introduce un valor erroneo en las posiciones donde el jugador colocara su marca, el jugador abandona, o uno de los dos jugadores gana la partida
la partida se gana si se realiza un tres en raya , aunque tambien puede haber un empate; 
en caso de que uno de lso jugadores seleciones las cordenadas de la marca del otro juagdor este debera recibir un "ocupado"
que comiece el juego y que la suerte este de vuestro lado 
*/

public class TresEnRatlla {
    public static void main(String[] args){
        boolean joc= true;
        
        char[][] taulell= { {'·','·','·'},
                            {'·','·','·'},
                            {'·','·','·'}};

        System.out.println("Comença el joc");
        
        mostrataula(taulell);
        
        while(joc){
        
        String posicion = "";
        
        System.out.println("jugador + ?");
        posicion = Entrada.readLine();
        posicion= posicion.toLowerCase();
            if(posicion.equals("a")){
                System.out.println("el jugador  abandona la partida");/**/
                break;
            }else{
                if(posicion.length() >= 2){
                //primerMov= posicion.charAt(0)= linea
                //segonMov= posicion.charAt(1)  column
                }
                    System.out.println("X?");
            }
        }
    }
    

    public static void mostrataula(char[][] taulell){
    for(int fil= 0; fil < taulell.length; fil++) {
        for(int col= 0; col < taulell.length; col++){
            System.out.print(taulell[fil][col]);
        }
        System.out.println();
      }
    }
}




/*
switch(jo)
     case"00":
        taulell[0][0]='X';
        break;
    
     case"01":
        taulell[0][1]='X';
        break;
    
     case"02":
        taulell[0][2]='X';
        break;
    
     case"10":
        taulell[1][0]='X';
        break;
        
     case"11":
        taulell[1][1]='X';
        break;
    
     case"12":
        taulell[1][2]='X';
        break;
    
     case"20":
        taulell[2][0]='X';
        break;
        
     case"21":
        taulell[2][1]='X';
        break;
    
     case"22":
        taulell[2][2]='X';
        break;








*/
