package Lista1;

public class ex5 {
    public static void main(String[] args) {

        int populacaoA = 80000;
        double crescimentoA =  3.0;

        int populacaoB = 200000;
        double crescimentoB = 1.5;
        int anos = 0;

        while(populacaoA < populacaoB) {
            populacaoA = (int) (populacaoA * (1+crescimentoA/100));
            populacaoB = (int) (populacaoB * (1+crescimentoB/100));
            anos++;
        }

        System.out.println("A populacao A demorara "+anos+ " anos para ultrapassar a populacao B");



    }
    
}
