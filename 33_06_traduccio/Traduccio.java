/*En este ejercicio vamos a desarrollar un programa que recibirá tres argumentos por línea de pedidos.

El primero corresponderá al nombre de un archivo de texto que supondremos que existe, y que contendrá un texto arbitrario.
Nos referiremos a este archivo como origen .
El segundo argumento corresponderá al nombre de otro archivo de texto que también supondremos que existe, y que llamaremos traducción
El contenido de este archivo será un csv formado por parejas de textos separadas con una coma ( ','). Las líneas que contengan un número de comas distinto a 1 serán ignoradas.
Al primer elemento de la pareja le llamaremos clave y al segundo valor .
El tercer argumento corresponderá al nombre de un archivo de texto que puede no existir.
Nos referiremos a este archivo como el destino .

El programa escribirá en su destino el contenido del origen por el que habrá reemplazado las apariciones de las claves por los correspondientes valores.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class Traduccio{
    public static void main (String [] args) throws IOException{
        if (args.length != 3){
            System.out.println("ERROR: Cal especificar els fitxers origen, traduccio i destinació");
            return;
        }
        String origen =args[0];
        String traduccion=args[1];
        String destino=args[2];
        Traductor(origen, traduccion, destino);
        
    }
    public static void Traductor(String archivoOrigen, String archivoTraduccio, String archivoDestino) throws IOException{
        BufferedReader input = new BufferedReader(new FileReader(archivoOrigen));
            BufferedWriter salida = new BufferedWriter(new FileWriter (archivoDestino));
            while(true){
                String linea= input.readLine();
                if(null== linea) break;
                String nuevaLin= tradueixLinia(linea, archivoTraduccio);
                salida.write(nuevaLin);
                salida.newLine();
            }
        input.close();
        salida.close();
    }
    public static String tradueixLinia(String linea, String archivoTraduccio) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(archivoTraduccio));
        while (true) {
            String change = input.readLine();
            if (null == change) break;
            String[] elements = change.split(",");
            if(elements.length != 0)
            linea= linea.replace(elements[0], elements[1].strip());
           
        }
        input.close();
         return linea;
    }
}
