/*
*/
public class CadenaContinua{
    public static void main(String[]args){
    
        int dif= 0;
        int resultado= 0;
        
        System.out.println("Text?");
        String text = Entrada.readLine();

        if(!(text.isEmpty())|| !(text.isBlank())){
        System.out.println("Nombre?");
        int n = Integer.parseInt(Entrada.readLine());
        
            if(!(n<= 0) && n > text.length()){
                resultado=  n/text.length();
                dif= n-(text.length()*resultado);
                System.out.println(text.repeat(resultado) + text.substring(0, dif));
            } else if(n==1){
                n = 0;
                for (int i= 0; i<= n; i = i +1){
                    System.out.print(text.charAt(i));
                }
            } else if (n >1){
                for (int i= 0; i<= n-1; i = i +1){
                    System.out.print(text.charAt(i));
                }
            } else{
                for (int i= 1; i<= n; i = i +1){
                    System.out.print(text.charAt(i));
                }
            }
        }else{
            System.out.println("error");
        }
    }
}
