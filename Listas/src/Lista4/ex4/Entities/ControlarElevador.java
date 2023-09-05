package Lista4.ex4.Entities;

public class ControlarElevador extends Elevador {

    public void inicializa(int capacidade, int pessoas) {
        setCapacidade(capacidade);
        if (pessoas > getCapacidade()) {
            System.out.println("O elevador ja esta cheio");
        } else {
            setQuantidadePessoas(pessoas);
        }
    }

    public void entra() {
        if (getQuantidadePessoas() >= getCapacidade()) {
            System.out.println("Nao ha espaco para mais pessoas");
        } else {
            setQuantidadePessoas(getQuantidadePessoas() + 1);
        }
    }

    public void sair() {
        if (getQuantidadePessoas() != 0) {
            setQuantidadePessoas(getCapacidade());
        }
    }

    public void subirAndar() {
        if (getAndar() < getAndares()) {
            setAndar(getAndar() + 1);
        }
    }

    public void descerAndar() {
        if (getAndar() == 0) {
            System.out.println("Voce ja esta no terreo, nao possui mais andares a baixo");
        } else {
            setAndar(getAndar() - 1);
        }
    }

}
