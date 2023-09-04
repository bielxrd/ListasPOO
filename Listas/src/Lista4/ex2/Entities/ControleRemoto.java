package Lista4.ex2.Entities;

public class ControleRemoto extends TV {

    public ControleRemoto(int volume, int numeroDoCanal, boolean ligada) {
        super(volume, numeroDoCanal, ligada);
    }

    public void aumentarPotencia() {
        int volumeAtual = getVolume();
        volumeAtual += 1;
        setVolume(volumeAtual);

    }

    public void diminuirPotencia() {
        int volumeAtual = getVolume();
        volumeAtual -= 1;
        setVolume(volumeAtual);
    }

    public void aumentarCanal() {
        int nAtual = getNumeroDoCanal();
        nAtual += 1;
        setNumeroDoCanal(nAtual);
    }

    public void diminuirCanal() {
        int nAtual = getNumeroDoCanal();
        nAtual -= 1;
        setNumeroDoCanal(nAtual);
    }

    public void definirCanal(int canal) {
        setNumeroDoCanal(canal);
    }
    public void consultar() {
        System.out.println("Numero do Canal: "+getNumeroDoCanal()+ "\nVolume: "+getVolume() + "\nA tv esta ligada? "+isLigada());
    }

}