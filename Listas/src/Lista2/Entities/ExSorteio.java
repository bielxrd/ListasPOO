package Lista2.Entities;

import java.util.*;

public class ExSorteio {

    public void sorteio(int n, int numeroAleatorio) {
        Scanner ler = new Scanner(System.in);
        int tentativas = 1;
        while (n != numeroAleatorio) {

            System.out.println("Informe novamente");
            n = ler.nextInt();

            if (n == numeroAleatorio) {
                System.out.println("Voce acertou!");
                System.out.println("conseguiu em " + tentativas + " tentativas.");
            } else {
                tentativas++;
                if (n > numeroAleatorio) {
                    System.out.println("Menor!");
                } else if (n < numeroAleatorio) {
                    System.out.println("Maior");
                }

            }
        }
        ler.close();
    }
}
