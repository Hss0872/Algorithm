import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            BigInteger inputNum = scanner.nextBigInteger();
            BigInteger tmpDigit = BigInteger.ONE;
            int digitCnt = 1;
            BigInteger remainder = BigInteger.ONE.mod(inputNum);

            while (!remainder.equals(BigInteger.ZERO)) {
                tmpDigit = tmpDigit.multiply(BigInteger.TEN);
                remainder = tmpDigit.mod(inputNum).add(remainder).mod(inputNum);

                /*
                1 11 111 1111 11111 111111

                3 % 1 != 0 remainder == 1

                3 % 1(remainder 1) + 10(remainder 1) != 0
                3 % 1 + 10 + 100 == 0
                while문 돌릴 때마다 각각의 나머지를 더해서 그게 3으로 나눠지는지 확인하면 됨

                 */
                
                digitCnt++;
            }

            System.out.println(digitCnt);
        }
    }
}