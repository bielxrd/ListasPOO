package Lista4.ex1.Aplications;
import Lista4.ex1.Entities.Divisao;
import Lista4.ex1.Entities.Multiplicacao;
import Lista4.ex1.Entities.OperacaoMatematica;
import Lista4.ex1.Entities.Soma;
import Lista4.ex1.Entities.Subtracao;
public class Matematica {
    public static void main(String[] args) {
        Matematica.mostrarCalculo(new Soma(), 5, 5);
        Matematica.mostrarCalculo(new Subtracao(), 15, 8);
        Matematica.mostrarCalculo(new Multiplicacao(), 5, 3);
        Matematica.mostrarCalculo(new Divisao(), 15, 3);
    }
    public static void mostrarCalculo(OperacaoMatematica operacao, double x, double y) {
        System.out.println("O resultado é "+operacao.calcular(x,y));
    }
}