package Lista1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String email = ""; String senha = "";

        do{
            System.out.println("Informe o seu email");
            email = ler.nextLine();
            System.out.println("Informe sua senha: ");
            senha = ler.nextLine();

            if(senha.equalsIgnoreCase(email)) {
                System.out.println("Nao e permitido ter uma senha igual ao email!");
            }
            else {
                System.out.println("Conta criada com sucesso!");
            }

        }while(senha.equalsIgnoreCase(email));

    }

}
