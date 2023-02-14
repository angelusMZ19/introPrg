public class UsaGatRenat {
     public static void main(String[] args) {
         GatRenat renat = new GatRenat();
         System.out.println("El gat Renat té " + renat.getVides() + " vides");
         renat.setVides(5);
         System.out.println("El gat Renat té " + renat.getVides() + " vides");
     }
}
