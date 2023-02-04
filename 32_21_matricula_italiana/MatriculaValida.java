/*
*/
public class MatriculaValida{
    public static void main (String [] args){
    System.out.println("Introdui una matricula");
    String matricula= Entrada.readLine();
        if (matricula.length()==7){
        boolean correcta=true;
            for(int i=0; i < matricula.length();i++){
                char c= matricula.charAt(i);
                    if(i==2 || i==3  || i==4 ){
                        if(Character.isDigit(c)){
                            correcta=true;
                        }else{
                            correcta= false;
                        }
                    }else{
                        correcta= esLletraValidaPerMatriculaItaliana(c);
                    }
                    if(correcta){
                        continue;
                    }else{
                        System.out.println("No és matrícula italiana válida");
                        return;
                    }
            }
            System.out.println("És una matrícula italiana válida");
        }else {
        System.out.println("No és matrícula italiana válida");
        }
    }
    public static boolean esLletraValidaPerMatriculaItaliana(char c){
        
        String lletres= "ABCDEFGHIJKLMNPRDTVWXYZ";
        for(int j=0; j<lletres.length(); j++){
            char v= lletres.charAt(j);
            if(c==v){
                return true;
            }else{
                continue;
            }
        }
        return false;
    }
}
