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
    
    String desconegudes="desconegudes.txt";
    BufferedWriter desconocidas= new BufferedWriter( new FileWriter(desconegudes, true));
    String archivo= "llegides.txt";
    BufferedReader input= new BufferedReader(new FileReader(archivo));
    String italianes= "italianes.txt";
    BufferedWriter conocidas= new BufferedWriter(new FileWriter(italianes, true));

        while (true){
            String linia = input.readLine();
            if (linia==null){
            break;
            }
            linia = linia.trim();
                    if(MatriculaItalianaValida(linia)){
                        desconocidas.write(linia);
                        desconocidas.newLine();

                    }else {
                            conocidas.write(linia.trim());
                            conocidas.newLine();
                    }
        }
        input.close();
        desconocidas.close();
        conocidas.close();
    }
    public static boolean MatriculaItalianaValida(String codigo){
        if(codigo.length() !=7){
        return false;
        }
            for(int i= 0; i<codigo.length(); i++){
                    if(i==2 || i==3 || i==4){
                        if(!Character.isDigit(codigo.charAt(i))){
                        return false;
                        }
                    }else{
                        if(esLletraValidaPerMatriculaItaliana(codigo.charAt(i))){
                        return false;
                        }
                    }
            }
            return true;
    }
    public static boolean esLletraValidaPerMatriculaItaliana(char lletra){
        String lletres= "IOQU";
            if(lletra>'A' || lletra<'Z'){
                return false;
            }else{
                for(int j=0; j<lletres.length(); j++){
                    if (lletra == lletres.charAt(j));
                return false;
            }
        }
        return true;
    }
    
}

