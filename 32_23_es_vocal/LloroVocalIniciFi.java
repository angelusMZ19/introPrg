/*
En diferents exercicis ens hem trobat la necessitat de distingir si un caràcter és o no una vocal. Ara que ja coneixem les funcions, podem definir la nostra funció esVocal() que rebi un caràcter i retorni un booleà indicant si el caràcter correspon o no amb una vocal.
Considerarem com a vocals totes les variants d'accents i dièresis de les vocals catalanes.
Recorda que aquests variants són, a banda de les cinc habituals, à, è, é, í, ï, ò, ó, ú i ü.
*//*
public class LloroVocalIniciFi{
    public static void main (String[]args){

       String paraula = "hola";

        while (!(paraula.isEmpty()) && !(paraula.isBlank())) {
        System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
        paraula= Entrada.readLine();

           if(!(paraula.isEmpty()) && !(paraula.isBlank())){
            System.out.println("El lloro repeteix: " + paraula);

           }
        }
     System.out.println ("Adéu");
    }
}*/

public class LloroVocalIniciFi{
    public static void mian (String[]args){
    System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
        System.out.println(UtilString.esVocal(Entrada.readLine()));
    }
}
