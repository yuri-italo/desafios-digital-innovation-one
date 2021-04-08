import java.util.Scanner;

public class MultiplicacaoSimples {

  public static void main(String [] args) {

    int num1, num2, total;

    Scanner leia = new Scanner(System.in);

    num1 = leia.nextInt();

    num2 = leia.nextInt();

    total = num1 * num2;

    System.out.print("PROD = " + total);

  }

}