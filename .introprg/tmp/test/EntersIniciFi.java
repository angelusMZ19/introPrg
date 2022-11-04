/*
*/
/*Desarrolla un programa que solicite tres números enteros, y escriba los valores entre el primero y el segundo saltando de uno al siguiente con el tercero.
*/
public class EntersIniciFi{
    public static void main (String[]args){    
     
      
    System.out.println("Valor inicial?");
    int v1 = Integer.parseInt(Entrada.readLine());
    
    System.out.println("Valor final?");
    int v2 = Integer.parseInt(Entrada.readLine());
    
    System.out.println("Salt?");
    int v3 = Integer.parseInt(Entrada.readLine());
    
          
        for ( v1 = v1; v1 <= v2; v1= v1 + v3){
         System.out.println(v1);     
         }
    }  
}
