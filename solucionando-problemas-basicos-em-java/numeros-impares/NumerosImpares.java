import java.util.Scanner;

public class NumerosImpares {

	public static void main(String [] args) {
		Scanner leia = new Scanner(System.in);
		int num = leia.nextInt();

		for (int c = 0; c <= num; c++) {
			if (c % 2 != 0) {
				System.out.println(c);
			}
		}
	}

}