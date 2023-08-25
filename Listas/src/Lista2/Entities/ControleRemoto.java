package Lista2.Entities;

public class ControleRemoto extends Televisao {

    public ControleRemoto(int volume, int numeroDoCanal) {
        super(volume, numeroDoCanal);
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
        System.out.println("Numero do Canal: "+getNumeroDoCanal()+ "\nVolume: "+getVolume());
    }

}
