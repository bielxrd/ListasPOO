package Lista3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ex1 {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Informe seu nome");
        String name = ler.nextLine();
        System.out.println("Informe sua altura");
        double altura = ler.nextDouble();
        System.out.println("Informe sua data de nascimento: ");
        ler.nextLine();
        LocalDate d01 = LocalDate.parse(ler.nextLine(), fmt1);

        GerenciamentoClientes gerenciamento = new GerenciamentoClientes(name, d01, altura, true);

        gerenciamento.imprimirDados();
    }
    
}
