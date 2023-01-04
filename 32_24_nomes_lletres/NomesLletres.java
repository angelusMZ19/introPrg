/*
Programa de manera modular que muestra solo las letras del el texto que se ha introducido. añadiendo los mdlulos en arcvhivos exteros
 */
public class NomesLletres{

    public static void main(String[] args) {
        System.out.println("Text?");
        System.out.println(
            UtilString.lletresSeparades(
                UtilString.nomesLletres(
                    Entrada.readLine()
                    )
                )
            );
    }
}
