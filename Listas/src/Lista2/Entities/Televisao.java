package Lista2.Entities;

public class Televisao {
    private int volume;
    private int numeroDoCanal;

    public Televisao(int volume, int numeroDoCanal) {
        this.volume = volume;
        this.numeroDoCanal = numeroDoCanal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNumeroDoCanal() {
        return numeroDoCanal;
    }

    public void setNumeroDoCanal(int numeroDoCanal) {
        this.numeroDoCanal = numeroDoCanal;
    }

}
