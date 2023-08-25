package Lista1.Entities;

public class Investimento {
    private double investido;
    private double taxa;
    private double calculo;

    public Investimento(double investido, double taxa) {
        this.investido = investido;
        this.taxa = taxa;
    }

    public double getInvestido() {
        return investido;
    }

    public void setInvestido(double investido) {
        this.investido = investido;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double investido, double taxa) {

        double saldo = 0;

        for (int i = 0; i < 12; i++) {

            saldo = investido + (saldo * (1 + taxa / 100));
            if (i == 0) {
                System.out.println(saldo);
            }

        }
        this.calculo = saldo;

    }

}
