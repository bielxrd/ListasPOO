package Lista2.Entities;

public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositarSaldo(double saldo) {
        this.saldo += saldo;
    }

    public void sacarSaldo(double saldo) {
        this.saldo -= saldo;
        saldo = saldo - (saldo * (0.5 / 100.0));
        System.out.println("Foi possivel sacar: " + saldo + " Reais.");
    }

}
