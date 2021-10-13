import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeEntradas = sc.nextInt();

        for(int i=0; i < quantidadeEntradas; i++) {
            int quantidadePessoas = sc.nextInt();
            sc.nextLine();
            String[] filaString = sc.nextLine().split(" ");
            List<Integer> fila = Arrays
                    .stream(filaString)
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());

            List<Integer> filaOrdenada = new ArrayList<>(fila);
            filaOrdenada.sort(Collections.reverseOrder());

            int pessoasMesmaOrdem = 0;
            for(int j=0; j < quantidadePessoas; j++) {
                if(Objects.equals(fila.get(j), filaOrdenada.get(j)))
                    pessoasMesmaOrdem++;
            }
            System.out.println(pessoasMesmaOrdem);
        }
    }
}