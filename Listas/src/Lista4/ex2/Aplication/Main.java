package Lista4.ex2.Aplication;

import java.util.Scanner;

import Lista4.ex2.Entities.ControleRemoto;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Deseja ligar a tv? true or false");
        boolean resp = ler.nextBoolean();

        if(resp == true) {
            System.out.println("Qual canal voce deseja?");
            int canal = ler.nextInt();
            System.out.println("Qual volume?");
            int volume = ler.nextInt();
            ControleRemoto controle = new ControleRemoto(volume, canal, resp);

            

            controle.consultar();

            ler.close();
        }
    }
    
}
