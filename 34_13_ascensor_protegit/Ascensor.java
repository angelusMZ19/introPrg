/*

*/
public class Ascensor{
    private int pis=-1;
    private String moviment= "aturat";

    public int getPis(){
        return pis;
    }
    public void setPis(int nouPis){
        if (pis >= -1 && pis<10) {
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
