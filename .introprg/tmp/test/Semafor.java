/*
 * es unprograma ayudante para semafor 
 */
public class Semafor {
    public static void main(String[] args) {
        System.out.println("color?");
       
        String color = Entrada.readLine();
        if (color.equals("rojo")) {
            System.out.println("Detente");
                } else if (color.equals("amarillo")) {
                    System.out.println("Corre!");
                        } else if (color.equals("verde")) {
                            System.out.println("Cruza");}
                            
                            else{
                            System.out.println("ve al oculista");}
    }
}
