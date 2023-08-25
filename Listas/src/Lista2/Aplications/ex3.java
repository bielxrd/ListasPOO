package Lista2.Aplications;

import java.util.Scanner;

import Lista2.Entities.ExPrimos;

public class ex3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um n para verificar se é primo ou n");
        int n = ler.nextInt();

        ExPrimos primos = new ExPrimos();

        primos.verificarPrimos(n);

        
        ler.close();
    }
    
}
