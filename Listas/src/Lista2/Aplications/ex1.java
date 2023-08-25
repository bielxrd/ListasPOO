package Lista2.Aplications;

import java.util.Scanner;

import Lista2.Entities.ContaCorrente;
import Lista2.Entities.ContaEspecial;

public class ex1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        
        String resp = "";

        do {
            System.out.println("Conta corrente ou especial? (s/n)");
            resp = ler.nextLine();
            if (resp.equalsIgnoreCase("s")) {
                ContaEspecial conta = new ContaEspecial(8000);
                conta.sacarSaldo(800);
                System.out.println(conta.getSaldo());
            } else {
                ContaCorrente conta = new ContaCorrente(5000);

                conta.sacarSaldo(500);

                System.out.println(conta.getSaldo());

            }
            System.out.println("Digite sair para sair ou continuar");
            resp = ler.nextLine();

        } while (!resp.equalsIgnoreCase("Sair"));
        ler.close();

    }
}
