import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ValidadorDeSenhasComRequisitos {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String senha;

        while ((senha = br.readLine()) != null) {
            boolean tamanhoCerto = senha.length() >= 6 && senha.length() <= 32;
            boolean temPontuacao = !senha.matches("^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$");
            boolean temNumero = false;
            boolean temCaixaAlta = false;
            boolean temCaixaBaixa = false;

            for (int i = 0; i < senha.length(); i++) {
                if (Character.isDigit(senha.charAt(i))) {
                    temNumero = true;
                } else if (Character.isUpperCase(senha.charAt(i))) {
                    temCaixaAlta = true;
                } else if (Character.isLowerCase(senha.charAt(i))) {
                    temCaixaBaixa = true;
                }
            }

            if (tamanhoCerto && !temPontuacao && temNumero && temCaixaAlta && temCaixaBaixa) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }
}