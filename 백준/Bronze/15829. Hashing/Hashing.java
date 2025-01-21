import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String inputString = scanner.nextLine();
        final int POW_R = 31;
        final int MOD_M = 1234567891;

        System.out.println(hashFunction(inputString, POW_R, MOD_M));
    }

    private static int hashFunction(String inputString, final int POW_R, final int MOD_M) {
        int hashValue = 0;
        int strLength = inputString.length();
        char[] chars = inputString.toCharArray();

        for (int i = 0; i < strLength; i++) {
            int num = Character.getNumericValue(chars[i]) - (Character.getNumericValue('a') - 1);
            hashValue += num * (int) Math.pow(POW_R, i);
        }

        return hashValue % MOD_M;
    }
}