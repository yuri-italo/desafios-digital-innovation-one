import java.util.Scanner;

public class NumerosImparesAlternativo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        for (int c = 1; c <= num; c = c += 2) {
            System.out.println(c);
        }
    }

}