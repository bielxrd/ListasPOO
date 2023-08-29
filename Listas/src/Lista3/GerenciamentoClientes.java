package Lista3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GerenciamentoClientes extends Cliente {

    public GerenciamentoClientes(String nome, LocalDate dataNascimento, double altura, boolean cliente) {
        super(nome, dataNascimento, altura, cliente);
    }

    public void imprimirDados() {
        if (isClienteAtivo() == true) {
            DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("O cliente " + getNome() + " Altura: " + getAltura() + " Data de nascimento = "
                    + fmt1.format(getDataNascimento()) + " Conta ativa? "+isClienteAtivo());
        }
    }

}
