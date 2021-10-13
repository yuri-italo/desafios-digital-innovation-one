import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int listQtt = input.nextInt();

        while (input.hasNextLine()) {
            String line = input.nextLine();
            List<String> list = Arrays.asList(line.split(" "));
            System.out.println(list.stream()
                    .distinct()
                    .sorted()
                    .collect(Collectors.joining(" ")));
        }
    }
}