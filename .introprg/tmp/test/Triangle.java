/*Programa que dibuja una piramite de numeros y puntos segun se le indica
*/
public class Triangle {
    public static void main (String[]args){
    
    
        for(int lin=9; lin >= 0; lin--){
                
            for (int col=0; col<=lin; col++){
                System.out.print('.');
            }
            for(int col=lin; col<=8; col++){
                System.out.print(col);
            }
            System.out.print(9);
                
                for (int col=lin; col<=8; col++){
                    System.out.print(col);
                }
                for (int col=0; col<=lin; col++){
                System.out.print('.');
                }
        }
    }
}
