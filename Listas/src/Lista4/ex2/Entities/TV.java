package Lista4.ex2.Entities;

public class TV {
    private int volume;
    private int numeroDoCanal;
    private boolean ligada;

    public TV(int volume, int numeroDoCanal, boolean ligada) {
        this.volume = volume;
        this.numeroDoCanal = numeroDoCanal;
        this.ligada = ligada;
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

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

}
