import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int positiveQtt = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            if (input.nextFloat() > 0)
                positiveQtt++;
        }
        System.out.println(positiveQtt + " valores positivos");
    }
}
