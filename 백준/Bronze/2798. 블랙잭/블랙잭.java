import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        String[] temp1 = input1.split(" ");
        int goalNumber = Integer.parseInt(temp1[1]);
        int result = 0;

        String[] strings = input2.split(" ");
        int[] cards = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            cards[i] = Integer.parseInt(strings[i]);
        }

        Arrays.sort(cards);

        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                for (int r = j + 1; r < cards.length; r++) {
                    int temp = cards[i] + cards[j] + cards[r];
                    if (temp <= goalNumber) {
                        result = Math.max(result, temp);
                    } else {
                        break;
                    }
                }
            }
        }

        System.out.println(result);

    }
}