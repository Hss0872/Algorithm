import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        int testCnt = Integer.parseInt(inputStr);

        for (int i = 1; i <= testCnt; i++) {
            String testStr = scanner.nextLine();
            char[] charArray = testStr.toCharArray();

            int tmp = 0;
            int totalScore = 0;
            for (char c : charArray) {
                if (c == 'O') {
                    tmp++;
                    totalScore += tmp;
                } else {
                    tmp = 0;
                }
            }
            System.out.println(totalScore);
        }
    }
}