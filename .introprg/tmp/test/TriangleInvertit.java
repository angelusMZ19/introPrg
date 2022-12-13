/*
programa que inprime un triangulo invertido
*/
public class TriangleInvertit{
    public static void main (String[]args){
        
        System.out.println("Nombre?");
        int n= Integer.parseInt(Entrada.readLine());
        if (n >= 1){
            for(int lin= 1; lin<= n; lin++){
                System.out.println("");
                for(int col= 1; col <= (n-lin) +1; col++){
                    if(col ==1){
                        System.out.print(col);
                    }else{
                        System.out.print("," + col);
                    }
                }
            }
            }else {
                System.out.println("");
            }
    }
}
