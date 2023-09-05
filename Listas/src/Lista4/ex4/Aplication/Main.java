package Lista4.ex4.Aplication;

import Lista4.ex4.Entities.ControlarElevador;

public class Main {
    public static void main(String[] args) {

        ControlarElevador controle = new ControlarElevador();

        controle.setAndar(0);
        controle.setAndares(12);
        controle.setCapacidade(15);
        controle.setQuantidadePessoas(0);

        for (int i = 0; i < 15; i++) {
            controle.entra();
            
        }

        System.out.println(controle.getQuantidadePessoas()+" pessoas no elevador.");
        controle.subirAndar();
        controle.subirAndar();

        System.out.println("Andar = "+controle.getAndar());
        controle.sair();
        controle.sair();
        System.out.println(controle.getQuantidadePessoas()+" pessoas no elevador.");

        controle.setAndar(11);
        controle.subirAndar();
        System.out.println(controle.getAndar());
        controle.subirAndar();
        

        
        
    }
    
}
