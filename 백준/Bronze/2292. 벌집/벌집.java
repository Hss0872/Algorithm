import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inputNum = scanner.nextLong();
        long roomCount = 1;
        long increCnt = 0;
        boolean isEnd = false;

        /**
         *  1칸 1                           6 * 0 + 1
         *  2칸 주변 6(6 * 1)개 == 7까지      6 * 1 + 1
         *  3칸 주변 12(6 * 2)개  == 19까지   6 * 3 + 1
         *  4칸 주변 18(6 * 3)개  == 37까지   6 * 6 + 1
         *  5칸 주변 24(6 * 4)개  == 61까지   6 * 10 + 1
         *  6칸 주변 30(6 * 5)개  == 91까지   6 * 15 + 1
         *
         */

        if (inputNum == 1) {
            System.out.println(1);
            return;
        }

        while (!isEnd) {
            roomCount++;
            increCnt += roomCount - 1;

            if ((inputNum - 1) / 6.0 <= increCnt) {
                isEnd = true;
            }
        }

        System.out.println(roomCount);
    }
}