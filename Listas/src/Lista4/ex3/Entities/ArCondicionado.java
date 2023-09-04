package Lista4.ex3.Entities;

public class ArCondicionado {
    private double temperatura;
    private boolean ligado;
    private int intensidade;
    private boolean oscilacao;

    public ArCondicionado(double temperatura, boolean ligado, int intensidade, boolean oscilacao) {
        this.temperatura = temperatura;
        this.ligado = ligado;
        this.intensidade = intensidade;
        this.oscilacao = oscilacao;
    }
    public ArCondicionado() {
        
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }

    public boolean isOscilacao() {
        return oscilacao;
    }

    public void setOscilacao(boolean oscilacao) {
        this.oscilacao = oscilacao;
    }

    
    
    

}
