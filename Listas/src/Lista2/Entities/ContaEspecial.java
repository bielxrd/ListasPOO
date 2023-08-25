package Lista2.Entities;

public class ContaEspecial extends ContaCorrente {

    public ContaEspecial(double saldo) {
        super(saldo);
    }

    @Override
    public void sacarSaldo(double saldo) { 
        double saldoAtual = getSaldo();
        saldoAtual -= saldo;
        saldo = saldo - (saldo * (0.1 / 100.0));
        setSaldo(saldoAtual);
        System.out.println("Foi possivel sacar: " + saldo + " Reais.");
    }

}
