import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        char[] charArray = inputStr.toCharArray();
        int[] result = new int[26];

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        int Cnt = 0;

        // 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력
        for (char c : charArray) {
            if (result[c - 'a'] == -1) {
                result[c - 'a'] = Cnt;
            }
            Cnt++;
        }

        System.out.print(result[0]);
        for (int i = 1; i < result.length; i++) {
            System.out.printf(" %d", result[i]);
        }
    }
}