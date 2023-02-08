/*
En aquest exercici acabarem de completar algunes de les funcions associades al tipus Alumne que hem definit als continguts.
*/
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class CercaAlumnes {

    static class Alumne {
        String nom;
        String email;
        int edat;
        boolean esOient;
        int[] notes;
    }

    public static Alumne construeixAlumne(String nom, String email,
                                          int edat, boolean esOient,
                                          int[] notes) {
        Alumne alumne = new Alumne();
        alumne.nom = nom;
        alumne.email = email;
        alumne.edat = edat;
        alumne.esOient = esOient;
        alumne.notes = notes;
        return alumne;
    }

    public static void mostraAlumne(Alumne alumne) {
        System.out.println("Alumne: " + alumne.nom);
        System.out.println("- email: " + alumne.email);
        System.out.println("- edat: " + alumne.edat);
        System.out.println("- és oïent: " + (alumne.esOient?"Sí":"No"));
        System.out.println("- notes: " + notesACsv(alumne.notes));
    }

    public static String alumneAString(Alumne alumne) {
        return String.format(
                "Alumne(nom: \"%s\", email: \"%s\", " +
                "edat: %d, esOient: %b, notes: {%s})",
                alumne.nom, alumne.email, alumne.edat, alumne.esOient,
                notesACsv(alumne.notes));
    }

    // converteix un array de notes a CSV
    // Té en comptes els valors NP com a -1
    public static String notesACsv(int[] notes) {
        String notas="";
        for(int i=0; i<notes.length; i++){
            if(i==0){
                if(notes[i]==-1){
                notas = notas + "NP";
                }else{
                notas=notas+notes[0];
                }
            }else{
                if(notes[i] == -1) {
                    notas=notas+",NP";
                }else {
                    notas = notas + "," + notes[i];
                }
            }
        }
        return notas;
    }

    public static String alumneACsv(Alumne alumne) {
       String alumneInscrito = alumne.nom + "," +alumne.email+ "," +alumne.edat+ "," + alumne.esOient+ "," + notesACsv(alumne.notes);
       return alumneInscrito;
    }

    public static Alumne csvAAlumne(String csv) {

        String[]arreglo= csv.split(",");
        int[]calificaciones=new int[6];
        Alumne alumno= new Alumne();
        alumno.nom= arreglo[0];
        alumno.email=arreglo[1];
        alumno.edat= Integer.valueOf(arreglo[2]);
        alumno.esOient = Boolean.valueOf(arreglo[3]);
        
        for (int i = 0; i < 6; i ++) {
            if (!arreglo[i+4].equals("NP")) {
                calificaciones[i] = Integer.parseInt(arreglo[i+4]);
            } else {
                arreglo[i+4] = "-1";
                calificaciones[i] = Integer.parseInt(arreglo[i+4]);
            }
        }
        alumno.notes = calificaciones;

        return alumno;
    }

    public static void main(String[] args) throws IOException {
       int cont =0;
       if (args.length< 1){
        System.out.println("Error: indica el criteri de cerca");
       }else{
        String search= args[0];
        BufferedReader input = new BufferedReader( new FileReader("alumnes.csv"));
            String linia = input.readLine();

        while (true) {
            linia=input.readLine();
            if(linia==null){
                if(cont == 0){
                    System.out.println("Cap alumen");
                }
                break;
            }
            Alumne alumne=csvAAlumne(linia);
            alumneACsv(alumne);
            csvAAlumne(linia);
            notesACsv(alumne.notes);
                alumneAString(csvAAlumne(linia));
                if (alumne.nom.contains(search) || alumne.email.contains(search)) {
                    cont++;
                    mostraAlumne(alumne);
                }
        }
        input.close();
       }
    }
}
