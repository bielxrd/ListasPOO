package Lista1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nome");
        String nome = ler.nextLine();

        while (nome.length() <= 3) {
            System.out.println("Escreva seu nome ate que esteja maior que 3 caracteres");
            nome = ler.nextLine();
        }

        System.out.println("Informe sua idade");
        int idade = ler.nextInt();

        while (idade < 0 || idade > 150) {
            System.out.println("Escreva sua idade(0-150)");
            idade = ler.nextInt();

        }

        System.out.println("Informe o seu salario");
        double salario = ler.nextDouble();

        while (salario <= 0) {
            System.out.println("Escreva seu salario, deve ser maior que zero.");
            salario = ler.nextDouble();

        }

        System.out.println("Qual seu sexo? ");
        char sexo = ler.next().charAt(0);

        while (sexo != 's' && sexo != 'f') {
            System.out.println("Informe o sexo(s/n)");
            sexo = ler.next().charAt(0);
        }

        System.out.println("Informe o seu estado civil");
        char estadoCivil = ler.next().charAt(0);

        while(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd'){
            System.out.println("Informe o estado civil correto(s,c,v,d)");
            estadoCivil = ler.next().charAt(0);

        }

        System.out.println(nome + ". " + idade + ". " + salario + ". " + sexo + ". "+estadoCivil);

    }

}
