/*
Al ejecutar programas complejos, suele ser interesante poder registrar las situaciones significativas que se van produciendo. Esto nos permite a posteriori entre otras cosas, auditar cómo se ha ejecutado, descubrir y reproducir errores.

Estos registros se suelen guardar en un archivo de texto con una o más líneas que describen qué ha ocurrido ya menudo cuando ocurrió. A este archivo se le suele conocer como archivo de log .

Los archivos de log pueden verse como una especie de periódico que describe aspectos de la ejecución de uno o más programas.

Para implementar el registro, se suele realizar mediante llamadas a módulos que escriben en el fichero, sin que el programa que los utiliza se tenga que preocupar de nada más. Como si hiciera un System.out.println().

En esta ocasión vamos a desarrollar una biblioteca de utilidades para guardar un registro de las acciones que van sucediendo en nuestro programa.

Por simplicidad, se desarrolara una biblioteca considerará que el archivo de log se llama log.txty se guardará en la carpeta actual (desde donde ejecutamos el programa)
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
