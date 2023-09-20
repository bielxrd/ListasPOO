package Generics;

public class MinhaClasse<T extends Number> {
    T numClasse;

    public MinhaClasse(T numClasse) {
        this.numClasse = numClasse;
    }
    Double aoQuadrado() {
        return numClasse.intValue() * numClasse.doubleValue();
    }
    
}
