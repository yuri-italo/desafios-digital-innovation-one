import java.util.*;

public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int qtt = input.nextInt();

        for (int i = 0; i < qtt; i++)
            list.add(input.nextInt());

        list.stream()
                .filter(x -> x % 2 == 0)
                .sorted()
                .forEach(System.out::println);

        list.stream()
                .filter(x -> x % 2 != 0)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
