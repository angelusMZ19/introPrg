/*
Desarrolla un programa que lea llegides.txty genere dos nuevos archivos llamados italianes.txty desconegudes.txttales que:
italianes.txtcontenga todas las matrículas halladas a llegides.txtque correspondan a matrículas válidas italianas. Recuerda, por ejemplo, este ejercicio
desconegudes.txtque corresponda a todas las matrículas halladas no válidas como matrículas italianas.
El contenido de los archivos italianes.txty desconegudes.txttendrá las siguientes características:
Las entradas aparecerán en el mismo orden que enllegides.txt
Las entradas aparecerán limpias . Es decir, no tendrán espacios en blanco ni al inicio ni al final y ninguna será una línea vacía.
El programa no se preocupará si ya existían o no los archivos de salida. Siempre les sobreescribirá incluso si no hay ningún dato que escribir a alguno de ellos.
*/
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class ClassificaMatricules{
    public static void main(String[]args)throws IOException {
    /*String archivo= "llegides.txt";
    String italianes= "italianes.txt";
    String desconegudes="desconegudes.txt";*/

    BufferedReader input= new BufferedReader(new FileReader("llegides.txt"));
    BufferedWriter desconocidas= new BufferedWriter( new FileWriter("desconegudes.txt"));
    BufferedWriter conocidas= new BufferedWriter(new FileWriter("italianes.txt"));

        while (true){
            String linia = input.readLine();
            if (null == linia) break;
            linia = linia.strip();
                    if(MatriculaItalianaValida(linia) == false){
                        if(existe(linia,"desconegudes.txt")==false){
                        BufferedWriter noVale= new BufferedWriter( new FileWriter("desconegudes.txt", true));
                            noVale.write(linia);
                            noVale.newLine();
                            noVale.close();

                        }else if(MatriculaItalianaValida(linia) == true){
                                if(existe(linia,"italianes.txt")==false){
                                BufferedWriter siVale=new BufferedWriter(new FileWriter("italianes.txt", true));
                                siVale.write(linia);
                                siVale.newLine();
                                siVale.close();
                                }
                        }
                }
        }
    input.close();
    }
    public static boolean MatriculaItalianaValida(String text){
        if(text.length() !=7) return false;
            for(int i= 0; i<text.length(); i++){
                    if(i==2 || i==3 || i==4){
                        if(!Character.isDigit(text.charAt(i)))
                         return false;
                    }else{
                    if(esLletraValidaPerMatriculaItaliana(text.charAt(i))== false)
                        return false;
                    }
            }
            return true;
    }
    public static boolean esLletraValidaPerMatriculaItaliana(char lletra){
        String lletres= "ÑIOQU";
            if(lletra<'A' || lletra>'Z'){
                return false;
            }else{
                for(int j=0; j<lletres.length(); j++){
                    if (lletra == lletres.charAt(j));
                return false;
            }
        }
        return true;
    }
    public static boolean existe(String linia, String archivo) throws IOException{
        BufferedReader input= new BufferedReader(new FileReader(archivo));
         while (true){
            String file = input.readLine();
            if (null == file) break;
            if (linia.equals(file)){
                input.close();
                return true;
            }
        }
        input.close();
        return false;
    }
}
