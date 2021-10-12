import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int evenNumbers = 0, oddNumbers = 0, negativeNumbers = 0, positiveNumbers = 0;

        for (int i = 1; i <= 5; i++)
            list.add(input.nextInt());

        for (var num : list) {
            if (num != 0) {
                if (num < 0)
                    negativeNumbers++;
                else
                    positiveNumbers++;
            }

            if (num % 2 == 0)
                evenNumbers++;
            else
                oddNumbers++;
        }
        System.out.println(evenNumbers + " par(es)");
        System.out.println(oddNumbers + " impar(es)");
        System.out.println(positiveNumbers + " positivo(s)");
        System.out.println(negativeNumbers + " negativo(s)");
    }
}
