package Lista2.Aplications;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Lista2.Entities.Pessoa;

public class ex8 {
    public static void main(String[] args) { //ex8 feito
        Scanner ler = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataEinstein = LocalDate.parse("14/03/1879", fmt1);
        LocalDate dataNewton = LocalDate.parse("04/01/1643", fmt1);

        Pessoa albert = new Pessoa("Albert Einstein", dataEinstein);
        Pessoa newton = new Pessoa("Isaac Newton", dataNewton);
        System.out.println("ALBERT");
        
        System.out.println(albert.getNome());
        System.out.println(albert.getData());
        System.out.println(albert.getMes());
        System.out.println(albert.getAno());

        System.out.println("albert teria = "+albert.getIdade()+" anos ");
        System.out.println("------------------");

        System.out.println("Newton!");
        System.out.println(newton.getNome());
        System.out.println(newton.getData());
        System.out.println(newton.getMes());
        System.out.println(newton.getAno());
        System.out.println("newton teria = "+newton.getIdade()+" anos ");

        

    }
    
}
