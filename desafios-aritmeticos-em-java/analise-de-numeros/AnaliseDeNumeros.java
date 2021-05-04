import java.util.Scanner;
import java.io.IOException;

public class AnaliseDeNumeros {
	public static void main (String[] args) throws IOException {

		Scanner read = new Scanner(System.in);
		int num = 0, evenNumbers = 0, oddNumbers = 0, negativeNumbers = 0, positiveNumbers = 0;

		for (int counter = 1; counter <= 5; counter ++) {
			num = read.nextInt();

			if(num % 2 == 0) {
				evenNumbers ++;
			} else {
				oddNumbers ++;
			}

			if (num == 0) {

			} else if (num < 0) {
				negativeNumbers ++;
			} else {
				positiveNumbers ++;
			}
		}
		System.out.println(evenNumbers + " valor(es) par(es)");
        System.out.println(oddNumbers + " valor(es) impar(es)");
        System.out.println(positiveNumbers + " valor(es) positivo(s)");
        System.out.println(negativeNumbers + " valor(es) negativo(s)");
	}
}