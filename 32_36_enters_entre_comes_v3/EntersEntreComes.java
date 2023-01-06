/*
En aquesta ocasió, el programa tindrà les següents modificacions:

    inicialment demanarà als usuaris quants valors vol introduir. En cas que demani menys de 1, el programa no donarà cap error però finalitzarà amb el missatge "Res a fer"

    es crea un array amb espai suficient per emmagatzemar el nombre de valors requerit

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
                    System.out.println("Valor "+(j+1) + "?");
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
