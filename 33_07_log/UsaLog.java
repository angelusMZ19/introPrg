/*
desarrollar una biblioteca de utilidades para guardar un registro de las acciones que van sucediendo en nuestro programa.
Por simplicidad, nuestra biblioteca considerará que el archivo de log se llama log.txty se guardará en la carpeta actual (desde donde ejecutamos el programa)
*/
import java.io.IOException;
public class UsaLog {
   public static void main(String[] args) throws IOException {
       Log.printError("Això és un error greu");
       Log.printWarning("Això és un avís");
       for (int i=0; i < args.length; i++) {
           Log.printInfo(String.format("Argument %d: %s", i, args[i]));
       }
       Log.reset();     // comencem a comptar un altre cop
       Log.printDebug("Aquí s'acaba el main()");
   }
}
