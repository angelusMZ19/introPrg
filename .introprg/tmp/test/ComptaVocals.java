/*
Considera la següent versió simplificada del programa ComptaAiEs en la que comptem les ocurrències de 'a' i 'e' però no les comparem:
*/
public class ComptaVocals{
    public static void main(String[] args) {
        System.out.println("Introdueix un text");
        String entrada = Entrada.readLine();
        int num1 = quantesOcurrencies(entrada, 'a');
        int num2 = quantesOcurrencies(entrada, 'à');
        int num3 = quantesOcurrencies(entrada, 'e');
        int num4 = quantesOcurrencies(entrada, 'è');
        int num5 = quantesOcurrencies(entrada, 'é');
        int num6 = quantesOcurrencies(entrada, 'i');
        int num7 = quantesOcurrencies(entrada, 'í');
        int num8 = quantesOcurrencies(entrada, 'ï');
        int num9 = quantesOcurrencies(entrada, 'o');
        int num10= quantesOcurrencies(entrada, 'ó');
        int num11= quantesOcurrencies(entrada, 'ò');
        int num12= quantesOcurrencies(entrada, 'u');
        int num13= quantesOcurrencies(entrada, 'ú');
        int num14= quantesOcurrencies(entrada, 'ü');
        mostraOcurrencies('a', num1);
        mostraOcurrencies('à', num2);
        mostraOcurrencies('e', num3);
        mostraOcurrencies('è', num4);
        mostraOcurrencies('é', num5);
        mostraOcurrencies('i', num6);
        mostraOcurrencies('í', num7);
        mostraOcurrencies('ï', num8);
        mostraOcurrencies('o', num9);
        mostraOcurrencies('ó', num10);
        mostraOcurrencies('ò', num11);
        mostraOcurrencies('u', num12);
        mostraOcurrencies('ú', num13);
        mostraOcurrencies('ü', num14);
    }
    public static void mostraOcurrencies(char lletra, int quantes) {
        System.out.println("Nombre de '" + lletra + "'s: " + quantes);
    }
    public static int quantesOcurrencies(String text, char lletra) {
        int comptador = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra) {
                comptador += 1;
            }
        }
        return comptador;
    }
}
