/* programa que mostra quantes 'a's i 'e's té el text llegit per stdin */
/*public class ComptaAiEs {
    public static void main(String[] args) {
        System.out.println("Introdueix un text");
        String entrada = Entrada.readLine();
        char lletra1 = Entrada.readLine().charAt(0);
        char lletra2 = Entrada.readLine().charAt(0);
        comparaOcurrencies(entrada, lletra1, lletra2);
    }
    public static void comparaOcurrencies(String text, char lletra1, char lletra2) {
        int comptadorlletra1 = 0;
        int comptadorlletra2 = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra1) {
                comptadorlletra1 += 1;
            }else if (text.charAt(i) == lletra2){
                comptadorlletra2 += 1;
            }
        }
        System.out.println("Nombre de '" + lletra1 + "'s: " + comptadorlletra1);
        System.out.println("Nombre de '" + lletra2 + "'s: " + comptadorlletra2);
        int comptador1 = 0;
        int comptador2 = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra1) {
                comptador1 += 1;
            } else if (text.charAt(i) == lletra2) {
                comptador2 += 1;
            }
        }
        if (comptador1 > comptador2) {
            System.out.println("Hi ha més " + lletra1 + "que" + lletra2);
        } else if (comptador1 < comptador2) {
            System.out.println("Hi ha menys " + lletra1 + " que " + lletra2);
        } else {
            System.out.println("Hi ha tantes " + lletra1 + " com " + lletra2);
        }
    }
}
*/

/* programa que mostra quantes 'a's i 'e's té el text llegit per stdin */
/*public class ComptaAiEs {
    public static void main(String[] args) {
        System.out.println("Introdueix un text");
        String entrada = Entrada.readLine();
        comptaLletra(entrada, 'a');
        comptaLletra(entrada, 'e');
        comparaAiEs(entrada);
    }
    public static void comptaLletra(String text, char lletra) {
        int comptador = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra) {
                comptador += 1;
            }
        }
        System.out.println("Nombre de '" + lletra + "'s: " + comptador);
    }
    public static void comparaAiEs(String text) {
        int comptadorA = 0;
        int comptadorE = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                comptadorA += 1;
            } else if (text.charAt(i) == 'e') {
                comptadorE += 1;
            }
        }
        if (comptadorA > comptadorE) {
            System.out.println("Hi ha més 'a's que 'e's");
        } else if (comptadorA < comptadorE) {
            System.out.println("Hi ha menys 'a's que 'e's");
        } else {
            System.out.println("Hi ha tantes 'a's com 'e's");
        }
    }
}*/

/* programa que mostra quantes 'a's i 'e's té el text llegit per stdin */
public class ComptaAiEs {
    public static void main(String[] args) {
        System.out.println("Introdueix un text");
        String entrada = Entrada.readLine();
        char lletra1 = 'a';
        char lletra2 = 'e';
        comptaLletra(entrada, lletra1, lletra2);
        comparaOcurrencies(entrada, lletra1, lletra2);
    }
    public static void comptaLletra(String text, char lletra1, char lletra2){
        int comptadorlletra1 = 0;
        int comptadorlletra2 = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra1) {
                comptadorlletra1 += 1;
            }else if (text.charAt(i) == lletra2){
                comptadorlletra2 += 1;
            }
        }
        System.out.println("Nombre de '" + lletra1 + "'s: " + comptadorlletra1);
        System.out.println("Nombre de '" + lletra2 + "'s: " + comptadorlletra2);
    }
        public static void comparaOcurrencies(String text, char lletra1, char lletra2) {
        int comptador1 = 0;
        int comptador2 = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra1) {
                comptador1 += 1;
            } else if (text.charAt(i) == lletra2) {
                comptador2 += 1;
            }
        }
        if (comptador1 > comptador2) {
            System.out.println("Hi ha més 'a's que 'e's");
        } else if (comptador1 < comptador2) {
            System.out.println("Hi ha menys 'a's que 'e's");
        } else {
            System.out.println("Hi ha tantes 'a's com 'e's");
        }
    }
}


/*
public class ComptaAiEs {
    public static void main(String[] args) {
        System.out.println("Introdueix un text");
        String entrada = Entrada.readLine();
        char lletra1 = 'a';
        char lletra2 = 'e';
        
        
        int comptadorlletra1 = 0;
        int comptadorlletra2 = 0;
        for (int i=0; i < entrada.length(); i++) {
            if (entrada.charAt(i) == lletra1) {
                comptadorlletra1 += 1;
            }else if (entrada.charAt(i) == lletra2){
                comptadorlletra2 += 1;
            }
        }
        System.out.println("Nombre de '" + lletra1 + "'s: " + comptadorlletra1);
        System.out.println("Nombre de '" + lletra2 + "'s: " + comptadorlletra2);
        comparaOcurrencies(entrada, lletra1, lletra2);
    }
        public static void comparaOcurrencies(String text, char lletra1, char lletra2) {
        int comptador1 = 0;
        int comptador2 = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra1) {
                comptador1 += 1;
            } else if (text.charAt(i) == lletra2) {
                comptador2 += 1;
            }
        }
        if (comptador1 > comptador2) {
            System.out.println("Hi ha més 'a's que 'e's");
        } else if (comptador1 < comptador2) {
            System.out.println("Hi ha menys 'a's que 'e's");
        } else {
            System.out.println("Hi ha tantes 'a's com 'e's");
        }
    }
}

*/

