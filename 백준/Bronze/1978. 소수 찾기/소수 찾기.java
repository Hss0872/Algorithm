import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tmp1 = scanner.nextLine();
        String numbers = scanner.nextLine();
        int totalPrimeNumberCnt = 0;

        for (String s : numbers.split(" ")) {
            if (isPrimeNumber(Integer.parseInt(s))) {
                totalPrimeNumberCnt++;
            }
        }

        System.out.println(totalPrimeNumberCnt);
    }

    private static boolean isPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }

        if (number == 2 || number == 3) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}