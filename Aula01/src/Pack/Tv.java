package Pack;

public class Tv {

    public int volume;
    public int canal;

    public Tv(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public void aumentarVolume () {

        this.volume++;

    }

    public void diminuirVolume () {

        this.volume--;
    }

    public void mudarCanal (int c) {

        this.canal = c;

    }

    public void status () {

        System.out.println("------- STATUS -------");
        System.out.println("VOLUME: " + this.volume);
        System.out.println("CANAL: " + this.canal + "\n");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

}
