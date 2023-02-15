/*
En este ejercicio, vuelve a añadir la propiedad posicioque incorporaste al ejercicio Renat tiene posición . En esta ocasión, haz la propiedad privada e implementa los accesores de forma que garantices que la posición del Renat sea siempre correcta, a la vez que pueda ser cambiada.
modulo de uso
*/
public class GatRenat {
    public int vides= 7;
    public String posicio= "estirat";
    public int getVides(){
        return vides;
    }
    public void setVides(int novasvides){
        if (vides >= 0) {
            vides = novasvides;
        }
    }
    public String getPosicio(){
        return posicio;
    }
    public void setPosicio(String novaposicio){
    if(novaposicio.equals("assegut")|| novaposicio.equals("dret"))
        posicio=novaposicio;
    }
}
