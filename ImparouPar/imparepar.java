package ImparouPar;
import java.util.Scanner;
public class imparepar {
    public static void main(String[] args) {
        int n1;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n1 = ler.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar ");
        }
    }
}
