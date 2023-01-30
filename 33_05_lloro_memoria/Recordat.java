/*
programa que aplica la escritura de un archivo y usa este mismo para repetir lo que se a ingresado en el documento 
es decir escribiremos un archivo y luego repetiremos su contenido
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;

public class Recordat{
    public static void main (String [] args) throws IOException{
        String nomFitxer = "records.txt";
        processaEntrada(nomFitxer);
        System.out.println("D'acord");
        mostraRecords(nomFitxer);
    }

    /**
     * Demana frases per entrada estàndard i les guarda a un fitxer
     * @param nomFitxer: nom del fitxer
     */
    public static void processaEntrada(final String nomFitxer) throws IOException {
        String text = "hola";
        Scanner teclado = new Scanner(System.in);

        while (!(text.isEmpty()) && !(text.isBlank())) {
        System.out.print("El lloro pregunta paraula: ");
            text = teclado.nextLine();
            FileWriter archivo = new FileWriter(text);
            BufferedWriter sortida = new BufferedWriter(archivo);
            
            sortida.write(nomFitxer);
                if(!(text.isEmpty()) && !(text.isBlank())){
                    System.out.println("El lloro registra: " + text);

                    sortida.close();
              
                }
        
        }
        System.out.println();
    }
     
    public static void mostraRecords(final String nomFitxer) throws IOException {
        String alegre = nomFitxer;
        FileReader file= new FileReader(alegre);
        BufferedReader input= new BufferedReader(file);
        
        while (true) {
            String palabra = input.readLine();
            if (null == palabra) break;
            System.out.println("El lloror recorda: "+ palabra);
        }
        input.close();
    }
}   
