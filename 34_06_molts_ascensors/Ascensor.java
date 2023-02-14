/*
En aquesta ocasió disposarà d'una funció anomenada creaAscensorsEnEscala() que rebrà un nombre d'ascensors i retornarà un array amb el nombre d'ascensors especificat de manera que cada ascensor estarà en el pis indicat per la seva posició a l'array.
*/
public class Ascensor {
    public int pis= 0 ;

    public static Ascensor[] creaAscensors(int quants) {
        Ascensor[]ascensors= new Ascensor[quants];
        for (int i = 0; i < ascensors.length; i++){
            ascensors[i]= new Ascensor();
            ascensors[i].pis= i;
        }
    return ascensors;
    }
    public static void main(String[] args){
        boolean numero= UtilString.esEnter(args[0]);
                if(numero== true){
                int quants= Integer.parseInt(args[0]);
                //if(!Character.isDigit(quants)){
                    Ascensor[] ascensors = creaAscensors(quants);
                    for (int i = 0; i < ascensors.length; i++) {
                        System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i].pis);
                    }
                }else{
                    System.out.println("Cap ascensor");
                }
    }
}
