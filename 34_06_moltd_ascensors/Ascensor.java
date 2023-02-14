/*
En aquesta ocasió disposarà d'una funció anomenada creaAscensorsEnEscala() que rebrà un nombre d'ascensors i retornarà un array amb el nombre d'ascensors especificat de manera que cada ascensor estarà en el pis indicat per la seva posició a l'array.
*/
public class Ascensor {
    public int quants=7;

    public static Ascensor[] creaAscensors(int quants) {
        Ascensor[]ascensors= creaAscensors(quants);
    }
    public static void main(String[] args){
        
        Ascensor[] ascensors = creaAscensors(quants);
        for (int i = 0; i < ascensors.length; i++) {
            System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i].pis);
        }
    }
}
