public class QuantsParells {
    public static void main(String[] args) {
        int parell = 0;
        int valor = 0;
        while (valor >= 0 ) {
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            if (valor % 2 == 0) {
                parell++ ;
                if (valor % 2 != 0) {
                parell--;
                }
            }
        }
        System.out.println("Nombre de parells introduïts: " + parell);
    }
}
