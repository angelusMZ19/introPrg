/*
En aquesta ocasió protegirem les propietats de l'ascensor de manera que:
el pis sempre sigui un valor entre -1 i 10
el moviment sempre sigui un dels següents valors: aturat, pujant, baixant
Inicialment, l'ascensor començarà a la planta -1 i aturat
*/
public class Ascensor{
    private int pis=-1;
    private String moviment= "aturat";

    public int getPis(){
        return pis;
    }
    public void setPis(int nouPis){
        if (nouPis >= 0 && nouPis<= 10) {
            pis = nouPis;
        }
    }
    public String getMoviment(){
        return moviment;
    }
    public void setMoviment(String nouMoviment){
    if(nouMoviment.equals("pujant")|| nouMoviment.equals("baixant"))
        moviment=nouMoviment;
    }
}
