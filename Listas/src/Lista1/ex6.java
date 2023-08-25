package Lista1;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a populacao da cidade A");
        int populacaoA = ler.nextInt();
        System.out.println("Informe a taxa de crescimento da populacao A");
        double crescimentoA = ler.nextDouble();

        System.out.println("Informe a populacao da cidade B");
        int populacaoB = ler.nextInt();
        System.out.println("Informe a taxa de crescimento da populacao B");
        double crescimentoB = ler.nextDouble();

        int anos = 0;
        int aux = 0;
        while (populacaoA < populacaoB) {
            if (populacaoA == populacaoB) {
                aux = anos;
            }
            populacaoA = (int) (populacaoA * (1 + crescimentoA / 100));
            populacaoB = (int) (populacaoB * (1 + crescimentoB / 100));
            anos++;
        }

        System.out.println("A populacao A demorara " + anos + " anos para ultrapassar a populacao B e demorara " + aux
                + " para empatar");

        ler.close();
    }

}
