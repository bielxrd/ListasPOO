package Lista1;

import java.util.Scanner;

import Lista1.Entities.Investimento;

public class ex1 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        String resp = "";

        do {
            System.out.println("Informe quanto sera o investimento");
            double investido = ler.nextDouble();
            System.out.println("Informe quanto sera a taxa");
            double taxa = ler.nextDouble();

            Investimento calc = new Investimento(investido, taxa);

            calc.setCalculo(calc.getInvestido(), calc.getTaxa());

            System.out.println("Seu investimento apos 1 ano: " + calc.getCalculo());

            System.out.println("Deseja continuar? ");
            ler.nextLine();
            resp = ler.nextLine();

        } while (!resp.equalsIgnoreCase("N"));
    }
}
