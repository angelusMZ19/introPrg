/*
Aquest procediment incrementarà en un el pis en que es troba l'ascensor que rep.

Et passo la plantilla amb el main() perquè el prgtest et deixi passar.
*/
public class Ascensor {
    public int pis= -1;
    public static void pujaPis(Ascensor ascensor) {
       ascensor.pis = ascensor.pis + 1;
    }
    public static void main(String[] args){
        Ascensor ascensor;
        ascensor= new Ascensor();
        System.out.println("L'ascensor inicialment està a la planta " + ascensor.pis);
        pujaPis(ascensor);
        System.out.println("L'ascensor finalment està a la planta " + ascensor.pis);
    }
}
