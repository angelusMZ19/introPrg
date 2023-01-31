/*
 * Programa que demostra una escriptura de dues línies en fitxer de text
 * Amb salt de línia preparat pel S.O.
 */
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class recuerdos {
    public static void main(String[] args) throws IOException {
        String cami = "resultat.txt";
         BufferedWriter sortida = new BufferedWriter(new FileWriter(cami));
        while (!(text.isEmpty()) && !(text.isBlank())) {
        System.out.print("El lloro pregunta paraula: ");
        text = Entrada.readLine();
            if(!(text.isEmpty()) && !(text.isBlank())){
             
               
                System.out.println("El lloro registra: " + text);
                sortida.write(text);
                sortida.newLine();
                
                sortida.close();
            }
            
        }
        System.out.println("Dàcord");
    mostraRecords(cami);
    }
     public static void mostraRecords(final String nomFitxer) throws IOException {
        FileReader fitxer = new FileReader (nomFitxer);
        BufferedReader input = new BufferedReader(fitxer);
        while (true) {
            String linia = input.readLine();
            if (null == linia) break;
            System.out.printf("El lloro recorda:%s%n ",linia);
        }
        input.close();
        System.out.println("Adeu");
    }
}




//Scanner teclado = new Scanner(System.in)
 //text = teclado.nextLine();
