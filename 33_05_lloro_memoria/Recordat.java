    /*
programa que aplica la escritura de un archivo y usa este mismo para repetir lo que se a ingresado en el documento 
es decir escribiremos un archivo y luego repetiremos su contenido
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class Recordat{
    public static void main (String [] args) throws IOException{
        String nomFitxer = "records.txt";
        processaEntrada(nomFitxer);
        System.out.println("D'acord");
        mostraRecords(nomFitxer);
    }

    public static void processaEntrada(final String nomFitxer) throws IOException {
        String text= "hola";
        int contador =0;
        BufferedWriter sortida = new BufferedWriter(new FileWriter(nomFitxer));
        while(!(text.isEmpty()) && !(text.isBlank())){
        System.out.println("El lloro pregunta paraula:");
            text = Entrada.readLine();
            text = text.strip();
            if(!(text.isEmpty()) && !(text.isBlank())){
                System.out.println("El lloro registra: " + text);
                    sortida.write(text);
                    sortida.newLine();
                    contador +=1;
            }
        }
        sortida.close();
    }
    public static void mostraRecords(final String nomFitxer) throws IOException {
    int contador = 0;
        FileReader fitxer = new FileReader (nomFitxer);
        BufferedReader input = new BufferedReader(fitxer);
        while (true) {
            String linia = input.readLine();
            if (null == linia) break;
            System.out.printf("El lloro recorda: %s%n",linia);
            contador +=1;
        }if(contador==0){
            System.out.println("El lloro no recorda res");
        }
        input.close();
        System.out.println("Adéu");
    }
}

