import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();
        int inputNum = Integer.parseInt(input);

        if (length == 1) {
            if (inputNum % 2 == 0) {
                System.out.println(inputNum / 2);
                return;
            } else {
                System.out.println(0);
                return;
            }
        }

        int[] tmpArrays = new int[length];

        /**
         * 1 + 1 => 2
         * 2 + 2 => 4
         * 3 + 3 => 6
         * 4 + 4 => 8
         * 5 + 5 => 10
         * 6 + 6 => 12
         * 7 + 7 => 14
         * 8 + 8 => 16
         * 9 + 9 => 18
         * 10 + 1 + 0 => 11
         * 11 + 1 + 1 => 13
         * 12 + 1 + 2 => 15
         * 13 + 1 + 3 => 17
         * 14 + 1 + 4 => 19
         * 15 + 1 + 5 => 21
         * ...
         * 19 + 1 + 9 => 29
         * 20 + 2 + 0 => 22
         * 21 + 2 + 1 => 24
         * 22 + 2 + 2 => 26
         * 23 + 2 + 3 => 28
         * 24 + 2 + 4 => 30
         * 25 + 2 + 5 => 32
         * 26 + 2 + 6 => 34
         * 27 + 2 + 7 => 36
         * 28 + 2 + 8 => 38
         *
         *
         */

        /**
         * length 2 일 때
         */

        if (length == 2) {
            for (int i = 5; i < inputNum; i++) {
                if (i >= 10) {

                    tmpArrays[0] = i % 10; // 1의 자리
                    tmpArrays[1] = i / 10; // 10의 자리

                    if (tmpArrays[0] + tmpArrays[1] + i == inputNum) {
                        System.out.println(i);
                        return;
                    }

                } else {
                    if (i * 2 == inputNum) {
                        System.out.println(i);
                        return;
                    }
                }
            }

            System.out.println(0);
            return;
        }

        /***
         * length 3 이상
         */
        for (int i = 0; i < length * 10; i++) {

            int checkNum = inputNum - (length * 10) + i;
            int tmpNum = 0;
            int totalNum = checkNum;

            tmpArrays[0] = checkNum % 10;

            for (int j = 1; j < length; j++) {
                tmpArrays[j] = (checkNum / (int) Math.pow(10, j)) % 10;
            }

            for (int j = 0; j < length; j++) {
                totalNum += tmpArrays[j];
            }

            if (totalNum == inputNum) {
                System.out.println(checkNum);
                return;
            }
        }

        System.out.println(0);
    }
}