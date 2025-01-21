import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int inputNum = Integer.parseInt(scanner.nextLine());
            if (inputNum == 0) {
                break;
            }

            if (isPalindrom(inputNum)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    private static boolean isPalindrom(int inputNum) {
        char[] charArray = String.valueOf(inputNum).toCharArray();
        int length = charArray.length;
        int left = 0;
        int right = length - 1;

        while (left < right) {
            if (charArray[left++] != charArray[right--]) {
                return false;
            }
        }

        return true;
    }
}