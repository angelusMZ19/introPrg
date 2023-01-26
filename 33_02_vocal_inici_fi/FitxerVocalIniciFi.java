/*
Recordes l'exercici en el que el lloro anava demanant texts i només repetia els que començaven o acabaven en vocal?

Desenvoluparem un programa que farà servir una estructura molt similar, per mostrar totes les línies d'un fitxer de text anomenat frases.txt que comencin o acabin en vocal catalana.

Per descomptat, caldrà que facis servir la funció esVocal() que vas utilitzar per la versió de referència.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FitxerVocalIniciFi{
    public static void main (String[]args)  throws IOException{
        String fitxer= "frases.txt";
        FileReader fileReader = new FileReader(fitxer);
        BufferedReader Input= new BufferedReader(fileReader);
        
            boolean esVocalInici= true;
            boolean esVocalFin= true;
            while (true) {
                String paraula= Input.readLine();
                if (null == paraula) break;
                        char caracterInici= paraula.charAt(0);
                        esVocalInici= UtilString.esVocal(caracterInici);

                        char caracterFin= paraula.charAt(paraula.length()-1);
                        esVocalFin= UtilString.esVocal(caracterFin);
                        
                        if(esVocalInici || esVocalFin){
                            System.out.println(paraula);
                            }
                        }
        Input.close();
    }
}
