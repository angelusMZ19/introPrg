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
            BufferedWriter sortida = new BufferedWriter(new FileWriter(nomFitxer));
            sortida.write(nomFitxer);
                if(!(nomFitxer.isEmpty()) && !(nomFitxer.isBlank())){
                    System.out.println("El lloro registra: " + text);
                    sortida.close();
              
                }
        
        }
        System.out.println("Adeu");
    }
     
    public static void mostraRecords(final String nomFitxer) throws IOException {
    
        FileReader file= new FileReader(nomFitxer);
        BufferedReader input= new BufferedReader(file);
        while (true) {
            String palabra = input.readLine();
            if (null == palabra) break;
            System.out.println("El lloror recorda: "+  nomFitxer);
        }
        input.close();
    }
}


/*


        System.out.println("El lloro espera paraula:");
        paraula= Entrada.readLine();

           if(!(paraula.isEmpty()) && !(paraula.isBlank())){
            System.out.println("El lloro repeteix: " + paraula);
            
           }          
        }
     System.out.println ("Adéu");*/
