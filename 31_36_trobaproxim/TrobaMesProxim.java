//Programa que te dice el valor mas proximo dentro de los valores introducido*/
public class TrobaMesProxim {
    public static void main(String[] args){
        int valor = 10000;
        int ancla= 0;
        int sequencia = 1;
        
        int dif = 0;
        int dif1 = 0;
        int difmin = 0;
        int valorReal = -1;
        int valorReal1;
        System.out.println("Introdueix l'àncora");
        ancla = Integer.parseInt(Entrada.readLine());
        if (ancla >= 0) {
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            if (valor < 0) {
                System.out.println("No s'ha introduït cap valor positiu");
            }
            while (valor >= 0) {
                dif = ancla -  valor ;
                dif = Math.abs(dif);
                valorReal =  valor ;
                sequencia += 1;
                System.out.println("Introdueix un valor");
                valor  = Integer.parseInt(Entrada.readLine());
                dif1 = ancla -  valor ;
                dif1 = Math.abs(dif1);
                valorReal1 = valor;
                
                //este if  me detecta el valor -1 como un valor aceptable, el sistema hace todo el procedimiento antes de comprobar si el valor es positivo;
                
                if (sequencia != 2) {
                    if (valor >= 0) {
                        if (dif < dif1) {
                            difmin = dif;
                            difmin = valorReal;
                            valorReal = valorReal;
                        }
                        else if (dif > dif1) {
                            dif = dif1;
                            difmin = dif;
                            difmin = valorReal1;
                        }
                    }
                } else if(sequencia == 2) {
                    difmin = valorReal;
                }
            }
            if (valorReal >= 0) {
                System.out.println("El valor introduït més pròxim a " + ancla + " és " +  difmin);
            }
        }
        else if (ancla < 0) {
            System.out.println("Àncora no vàlida");}
}
}
