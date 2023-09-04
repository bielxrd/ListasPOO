package Lista4.ex3.Aplication;

import java.util.Scanner;

import Lista4.ex3.Entities.ControleRemoto;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Deseja ligar o ar? true or false");
        boolean ligado = ler.nextBoolean();

        ControleRemoto controle = new ControleRemoto();

        if(ligado == true) {
            controle.ligar(ligado);

            System.out.println("Qual a temperatura");
            controle.setTemperatura(ler.nextDouble());
            System.out.println("Qual intensidade");
            controle.setIntensidade(ler.nextInt());
            System.out.println("tera oscilacao? true or false");
            controle.setOscilacao(ler.nextBoolean());
            
            controle.mostrarConfiguracao();
        }

        else {
            controle.desligar(ligado);
        }
        
    }
    
}
