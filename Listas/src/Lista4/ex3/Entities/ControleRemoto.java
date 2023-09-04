package Lista4.ex3.Entities;

public class ControleRemoto extends ArCondicionado {

    public ControleRemoto(double temperatura, boolean ligado, int intensidade, boolean oscilacao) {
        super(temperatura, ligado, intensidade, oscilacao);
    }
    public ControleRemoto() {
        super();
    }

    public void ligar(boolean ligado) {
        setLigado(true);
    }

    public void desligar(boolean ligado) {
        setLigado(false);
    }

    public void controlarTemperatura(double temp) {
        setTemperatura(temp);
    }

    public void controlarIntensidade(int intensidade) {
        setIntensidade(intensidade);
    }

    public void definirOscilacao(boolean oscilacao) {
        setOscilacao(oscilacao);
    }

    public void mostrarConfiguracao() {
        System.out.println("Temperatura = "+getTemperatura());
        System.out.println("Intensidade = "+getIntensidade());
        System.out.println("Oscilacao? "+isOscilacao());
        System.out.println("Ligado? "+isLigado());
    }

}
