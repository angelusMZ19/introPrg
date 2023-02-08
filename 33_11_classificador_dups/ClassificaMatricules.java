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
    BufferedWriter desconocidas= new BufferedWriter( new FileWriter(desconegudes));
            //desconocidas.close();
    String archivo= "llegides.txt";
    BufferedReader input= new BufferedReader(new FileReader(archivo));
    String italianes= "italianes.txt";
    BufferedWriter conocidas= new BufferedWriter(new FileWriter(italianes));
            //conocidas.close();

        while (true){
            String linia = input.readLine();
            if (linia==null){
            break;
            }
            linia = linia.strip();
                    if(matriculaItalianaValida(linia)==true){
                        if(existe(linia, "italianes.txt")== true){
                        /*BufferedWriter validas= new BufferedWriter(new FileWriter("italianes.txt", true));*/
                        conocidas.write(linia.strip());
                        conocidas.newLine();
                        
                        }
                    }else {
                    if(matriculaItalianaValida(linia)==false){
                        if(existe(linia, "desconegudes.txt")==false){
                        //BufferedWriter invalid= new BufferedWriter(new FileWriter("desconegudes.txt", true));
                            desconocidas.write(linia.strip());
                            desconocidas.newLine();
                            
                            }
                        }
                }
        }
        input.close();
        conocidas.close();
        desconocidas.close();
    }
    public static boolean matriculaItalianaValida(String codigo){
        String lletres= "IOQU";
        if(codigo.length() !=7){
        return false;
        }
        if(!Character.isUpperCase(codigo.charAt(0)) || !Character.isUpperCase(codigo.charAt(1))){
        return false;
        }
         for(int i=0; i<lletres.length(); i++){
            if((codigo.charAt(0) == lletres.charAt(i)) || (codigo.charAt(1) == lletres.charAt(i))){
                return false;
            }
        }
        for(int i=2; i<=4; i++){
            if(i==2 || i==3 || i==4){
                if(!Character.isDigit(codigo.charAt(i))){
                return false;
                }
            }
        }
        if(!Character.isUpperCase(codigo.charAt(5)) || !Character.isUpperCase(codigo.charAt(6))){
            return false;
        }
        for(int rec=0; rec < lletres.length(); rec++){
            if((codigo.charAt(5) == lletres.charAt(rec)) || (codigo.charAt(6) == lletres.charAt(rec))){
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
