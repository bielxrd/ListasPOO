package Lista2.Aplications;

import java.util.*;

import Lista2.Entities.ControleRemoto;

public class ex2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String resp = "";

        do {
            System.out.println("Qual numero da televisao");
            int num = ler.nextInt();
            System.out.println("Qual volume da televisao");
            int volume = ler.nextInt();

            ControleRemoto controle = new ControleRemoto(volume, num);

            controle.aumentarCanal();
            controle.aumentarPotencia();
            System.out.println("Deseja mudar para um canal especifico?");
            ler.nextLine();
            resp = ler.nextLine();

            if (resp.equalsIgnoreCase("Sim")) {
                System.out.println("Qual canal voce deseja");
                volume = ler.nextInt();
                controle.definirCanal(volume);
            }

            System.out.println("Mostrando canal e volume!");
            controle.consultar();

            controle.diminuirCanal();
            controle.diminuirPotencia();

            controle.consultar();

            System.out.println("Deseja continuar?");
            resp = ler.nextLine();
        } while (resp.equalsIgnoreCase("Sim"));
        ler.close();
    }
}