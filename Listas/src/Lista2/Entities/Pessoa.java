package Lista2.Entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

public class Pessoa {
    private String nome;
    private LocalDate informacoes;

    

    public Pessoa(String nome, LocalDate informacoes) {
        this.nome = nome;
        this.informacoes = informacoes;
    }

    public int getData() {

        return this.informacoes.getDayOfMonth();

    }

    public Month getMes() {
        return this.informacoes.getMonth();
    }

    public int getAno() {
        return this.informacoes.getYear();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        int idade = calcularIdade();
        return idade;
        
    }

    public int calcularIdade() {
        LocalDate d01 = LocalDate.now();
        Duration t1 = Duration.between(this.informacoes.atStartOfDay(), d01.atStartOfDay());
        long idade = t1.toDays() / 365;
        return (int) idade;
        

    }
}
