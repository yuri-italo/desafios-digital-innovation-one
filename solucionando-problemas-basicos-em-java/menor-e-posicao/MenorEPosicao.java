import java.util.Scanner;
import java.io.IOException;

public class MenorEPosicao {

	public static void main(String [] args) throws IOException {

		Scanner leia = new Scanner(System.in);

		int E = leia.nextInt();
		int[] X = new int[E];
		int menor = 0;
		int posMenor = 0;

		for (int c = 0; c < E; c++) {

			X[c] = leia.nextInt();

			if (c == 0) {

				menor = X[c];
				posMenor = c;

			} else if (X[c] < menor) {

				menor = X[c];
				posMenor = c;

			}
		}

		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + posMenor);

	}

}