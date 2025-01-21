import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String inputString = scanner.nextLine();
        final BigInteger POW_R = BigInteger.valueOf(31);
        final BigInteger MOD_M = BigInteger.valueOf(1234567891);

        System.out.println(hashFunction(inputString, POW_R, MOD_M));
    }

    private static BigInteger hashFunction(String inputString, final BigInteger POW_R, final BigInteger MOD_M) {
        BigInteger hashValue = BigInteger.ZERO;
        long strLength = inputString.length();
        char[] chars = inputString.toCharArray();

        for (int i = 0; i < strLength; i++) {
            BigInteger num = BigInteger.valueOf(Character.getNumericValue(chars[i]) - (Character.getNumericValue('a') - 1));
            hashValue = POW_R.pow(i).multiply(num).add(hashValue);
        }

        return hashValue.mod(MOD_M);
    }
}