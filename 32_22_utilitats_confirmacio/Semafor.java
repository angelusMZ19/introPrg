/*
 * es unprograma ayudante para semafor 
 */
public class Semafor {
    public static void main(String[] args) {
    System.out.println("Ets major d'edat?");
        if (UtilitatsConfirmacio.respostaABoolean(Entrada.readLine())) {
            System.out.println("Color?");
       
            String color = Entrada.readLine();
            if (color.equals("vermell")) {
                System.out.println("espera");
                    } else if (color.equals("groc")) {
                        System.out.println("corre!");
                            } else if (color.equals("verd")) {
                                System.out.println("passa");}
                                
                                else{
                                System.out.println("ves a l'oculista");}
        } else {
            System.out.println("Ho sento. Aquest és un programa per adults.");
        }
        
    }
}
