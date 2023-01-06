/*
Desenvolupa un programa que mostri cinc enters separats per comes tenint en comptes que els cinc valors es troben emmagatzemats en un array d'enters.
*/
public class EntersEntreComes {
    public static void main(String[] args) {
        System.out.println("Quants?");
        int quant = Integer.parseInt(Entrada.readLine());
            if(quant <= 0){
                System.out.println("Res a fer");
            } else {
                int[] numeros;
                numeros = new int[quant];
            //hora se pedira los valores de 5 que en este caso seria el maximo de cajones que podriamos guardar
                for(int j= 0; j < numeros.length; j++){
                    System.out.println("Valor"+(j+1) + "?");
                    numeros[j]= Integer.parseInt(Entrada.readLine());
                }
                System.out.print(numeros[0]);
        for (int i = 1; i < numeros.length; i++) {
            System.out.print(", " + numeros[i]);
            }
            System.out.println();
            }

    }
}
