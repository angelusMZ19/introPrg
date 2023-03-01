/*

*/
public class UsaAscensor {
    public static void main(String[] args) {
        Ascensor ascensor= new Ascensor();
        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getMoviment());
        System.out.println("Introdueix nou pis:");
        
        String piso= Entrada.readLine();
        boolean esEnter= esEnter(piso);
        if(esEnter== true){
            int valor= Integer.parseInt(piso);
            ascensor.setPis(valor);
        }

        System.out.println("Introdueix nou moviment:");
        
        ascensor.setMoviment(Entrada.readLine());
        
        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
    }
    public static boolean esEnter(String text){
        char mas ='+';
        char menos='-';
        int longitud = text.length();
        boolean numero= true;
            if (!text.isEmpty()){
                for(int i =0; i < longitud-1; i++){
                    if (!Character.isDigit(text.charAt(i))){
                        if (!(i==0 && (text.charAt(0)== mas || text.charAt(0)== menos))){
                         numero = false;
                        }
                    }
            }
        }else {
         numero= false;
        }
        return numero;
    }
}

