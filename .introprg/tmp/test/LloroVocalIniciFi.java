/*
En diferents exercicis ens hem trobat la necessitat de distingir si un caràcter és o no una vocal. Ara que ja coneixem les funcions, podem definir la nostra funció esVocal() que rebi un caràcter i retorni un booleà indicant si el caràcter correspon o no amb una vocal.
Considerarem com a vocals totes les variants d'accents i dièresis de les vocals catalanes.
Recorda que aquests variants són, a banda de les cinc habituals, à, è, é, í, ï, ò, ó, ú i ü.
*/
public class LloroVocalIniciFi{
    public static void main (String[]args){
        String paraula = "hola";
        boolean confirmacion = false;
            while (!confirmacion) {
            boolean esVocalInici= true;
            boolean esVocalFin= true;

                System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
                    paraula= Entrada.readLine();

                    if(!paraula.isBlank()){
                        char caracterInici= paraula.charAt(0);
                        esVocalInici= UtilString.esVocal(caracterInici);

                        char caracterFin= paraula.charAt(paraula.length()-1);
                        esVocalFin= UtilString.esVocal(caracterFin);
                        
                        if(esVocalInici || esVocalFin){
                            System.out.println("El lloro diu: " + paraula);
                            }
                            }else{
                                System.out.println("El lloro demana confirmació per finalitzar");
                                if (confirmacion = UtilitatsConfirmacio.respostaABoolean(Entrada.readLine())){
                                    confirmacion= true;
                                } else { 
                                    confirmacion= false;
                            }
                        }
                    }
            System.out.println ("Adéu");
    }
}
