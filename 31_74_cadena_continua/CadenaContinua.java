/*
*/
public class CadenaContinua{
    public static void main(String[]args){
    
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        System.out.println("Nombre?");
        int n = Integer.parseInt(Entrada.readLine());
            
            /*if(n > text.length()){
                n= text.length();
            if(n <= text.length()){
                for (int i = n; i >= text.length(); i++){
                    System.out.println(text.charAt(i));
                }
            }
            if (n > text.length()){
                for(int i = n; i <= n; i++){
                    System.out.println(text.charAt(i));
                }
            }
            if (text.isEmpty() && text.isBlank()){
                System.out.println("Error");
            }
        }*/
        if(n > text.length()){
            for (int i= text.length(); i<= text.length(); i++){
                System.out.print(text.charAt(n));
            }
         }
    }
}
