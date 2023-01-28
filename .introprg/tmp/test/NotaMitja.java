/*
Programa que lee la informacion que se encuentra dentro de un archivo .CSV y a partir de esas notas se debera imprimir los nombres de lso estudiantes registrado y tambien obtenenr la nota promedio de sus calificaciones
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NotaMitja {
    public static void main(String[] args) throws IOException{
            String fitxer= "notes.csv";
            FileReader file= new FileReader(fitxer);
            BufferedReader input= new BufferedReader(file);
            
            String linea= input.readLine();
            int nota=0;
            while (true) {
            double calificacion = 0;
            double suma = 0;
            String archivo = input.readLine();
            nota = nota + 1;
            if (archivo == null) {
                if (nota == 1) {
                    System.out.println("Cap entrada");
                }
                break;
            }
            String [] elements = archivo.split(",");
            for (int i = 0; i < elements.length; i++) {
                if (Character.isDigit(elements[i].charAt(0))) {
                    calificacion = Double.parseDouble(elements[i]);
                    suma = suma + calificacion; 
                }
            }
            double promedio = (suma/6.00);
            System.out.printf("%s (%.02f)%n",elements[0], promedio);
        }
        input.close();
    }
}
