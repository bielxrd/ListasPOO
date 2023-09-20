package Generics;

public class ExMultipleGenerics {
    public static void main(String[] args) {
        MinhaClasse<Integer> inteiro = new MinhaClasse<>(5);
        MinhaClasse<Double> decimal = new MinhaClasse<Double>(5.0);

        System.out.println(inteiro.aoQuadrado());
        System.out.println(decimal.aoQuadrado());
    }
    
}
