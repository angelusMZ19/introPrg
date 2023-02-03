/*
Bibliotecas de utilidades de error
*/
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Log{
    private static int n=1;
    private static String archivo = "log.txt";
    
    public static void printError(String text) throws IOException{
    BufferedWriter sortida = new BufferedWriter(new FileWriter(archivo, true));
        String mensaje= "[" + n + "]" +" ERROR: " + text;
        sortida.write(mensaje);
        sortida.newLine();
        sortida.close();
        n += 1;
    return ;
    }
    
    public static void printWarning(String text) throws IOException{
    BufferedWriter sortida = new BufferedWriter(new FileWriter(archivo, true));
        String mensaje= "[" + n + "]" +" WARNING: " + text;
        sortida.write(mensaje);
        sortida.newLine();
        sortida.close(); 
        n += 1;
    return ;
    }
    
    public static String printInfo(String text) throws IOException{
    BufferedWriter sortida = new BufferedWriter(new FileWriter(archivo, true));
        String mensaje= "[" + n + "]" +" INFO: " + text;
        sortida.write(mensaje);
        sortida.newLine();
        sortida.close(); 
        n += 1;
    return mensaje;
    }
    
    public static void printDebug(String text) throws IOException{
    BufferedWriter sortida = new BufferedWriter(new FileWriter(archivo, true));
        String mensaje= "[" + n + "]" +" DEBUG: " + text;
        sortida.write(mensaje);
        sortida.newLine();
        sortida.close(); 
        n += 1;
    return;
    }
    
    public static void reset() throws IOException{
    System.out.println();
        n= 1;
    return;
    }
}  
