public class Equipos {

    String name;
    int piojos;
    int disparo;
    public Equipos(String name,int disparo){
        this.name=name;
        this.piojos=3;
        this.disparo=disparo;
    }
    public int getPiojos() {
        return piojos;
    }

    public void setPiojos(int piojos) {
        this.piojos = piojos;
    }

    public int getDisparo() {
        return disparo;
    }

    public void setDisparo(int disparo) {
        this.disparo = disparo;
    }
}
