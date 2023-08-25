package Lista2.Aplications;

import java.util.Random;
import java.util.Scanner;

import Lista2.Entities.ExSorteio;

public class ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Random rdn = new Random();

        int numeroAleatorio = rdn.nextInt(0, 1000);

        System.out.println("Informe um numero: ");
        int chute = ler.nextInt();

        ExSorteio sorteio = new ExSorteio();

        sorteio.sorteio(chute, numeroAleatorio);


        ler.close();
    }
    
}
