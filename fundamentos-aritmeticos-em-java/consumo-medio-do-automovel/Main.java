import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x = input.nextFloat();
        float y = input.nextFloat();
        float z = x/y;

        System.out.printf("%.3f km/l",z);
    }
}
