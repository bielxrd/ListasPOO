package TratamentoExcecao;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2;
        String c1;

        try { // início do bloco que será monitorado
            do {
                System.out.println("Digite o primeiro numero:");
                c1 = in.next();
                n1 = Integer.parseInt(c1);
                System.out.println("Digite o segundo numero:");
                c1 = in.next();
                n2 = Integer.parseInt(c1);

                System.out.println(" A divisão entre eles é:" + (n1 / n2));
            } while (n1 != 0);
        } catch (ArithmeticException nae) {
            System.out.println(" erro provável: divisão por zero:" +
                    nae.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println(" tipo de dados incompatíveis:" +
                    nfe.getMessage());
        }

        catch (Exception e) {
            System.out.println(" erro genérico:" +
                    e.getMessage());
            System.out.println(" mostra o pacote, a exceção e mensagem de erro:" +
                    e.toString());
            e.printStackTrace();
        } finally {
            n1 = 0;
            n2 = 0;
            System.out.println(" variáveis zeradas!");
        }
    }
}
