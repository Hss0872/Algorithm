import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = scanner.nextInt();

        for (int i = 1; i <= inputNum; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            if (i != inputNum) {
                System.out.println();
            }
        }
    }
}