package Lista2.Entities;

public class ExPrimos {

    public void verificarPrimos(int n) {
        int divisiveis = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                divisiveis++;
            }
            
        }
        if(divisiveis == 2) {
            System.out.println("Numero primo!");
        }
        else {
            System.out.println("Nao e numero primo!");
        }
        

    }
    
}
