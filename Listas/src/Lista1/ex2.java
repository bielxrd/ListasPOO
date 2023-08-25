package Lista1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor = 0;
        do {
            System.out.println("Informe um valor entre 0 e 10");
            valor = ler.nextInt();

            if (valor >= 0 && valor <= 10) {
                System.out.println("Valor valido!");
            } else {
                System.out.println("valor invalido!");
            }
        } while (valor < 0 || valor > 10);
    }

}
