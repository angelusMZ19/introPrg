public class ejercicio_prueba{
    public static void main(String[]args) {
   /* System.out.println("Nom?");
    String nom= Entrada.readLine();
    System.out.println("Numero");
    int num= Integer.parseInt(Entrada.readLine());
    
   
    System.out.println(nom.length());
    System.out.println(nom.toUpperCase());
    System.out.println(nom.toLowerCase());
    System.out.println(nom.charAt(num-1));
    System.out.println();
    for (int i= 0 ; i < nom.length(); i++){
        System.out.println(nom.charAt(i) + " = " + (i+1));
    }
   }
}
   */
/*
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println("Cops?");
        int cops = Integer.parseInt(Entrada.readLine());
        if (text.isEmpty()) {
            System.out.println("Error: el text no pot ser buit");
        } else if (cops < 1) {
            System.out.println("Error: com a mínim un cop");
        } else {
            for (int i=0; i<cops; i++) {
                System.out.println(text);
            }
        }
    }
}
   */
   System.out.println("Text?");
        String text = Entrada.readLine();
        boolean conteJ = false;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == 'J') {
                conteJ = true;
            }
        }
        if (conteJ) {
            System.out.println("Conté J");
        } else {
            System.out.println("No conté J");
        }
    }
}
   
   
