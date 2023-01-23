/*Este prgrama se desarrollara para encontrar los valores numericos del texto introducido y se debera realizar con la recursividad sin usar ningun tipo de iterado for o while, do while*/
public class ExtreuNombres{
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        String numeros = extreuNombres(text);
        System.out.println(numeros);
        }
    // mostra només les lletres de text
    public static String extreuNombres(String text) {
        if(text.length()==0) {      // cas base
            return"";
        }

        // hi ha al menys un caràcter. Comptem quantes lletres hi queden

        // considerem el primer caràcter
        char number = text.charAt(0);
        if (Character.isDigit(number)) {
           System.out.print(number);
        }

        // considerem les lletres que conté la resta del text
        String difNum =  text.substring(1);  // resta del text
        extreuNombres(difNum);
        return"";

    }
}
