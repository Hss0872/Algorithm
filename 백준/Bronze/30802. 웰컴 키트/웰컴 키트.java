import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        펜은 1 자루씩 or P자루씩 묶음으로 주문 가능 P == 7
        티셔츠는 같은 사이즈의 T장씩 묶음으로 구매 가능 -> T == 5
        티셔츠는 남아도 되지만 부족해서는 안된다.
        펜은 남거나 부족해서는 안되고 정확히 참가자 수 만큼 주어야 한다.
         */

        Scanner scanner = new Scanner(System.in);
        String participants = scanner.nextLine();
        String tShirtCnts = scanner.nextLine();
        String numbers = scanner.nextLine();

        String[] sizeCnt = tShirtCnts.split(" ");
        String[] tmp1 = numbers.split(" ");

        int participantCnt = Integer.parseInt(participants);
        int tShirtNumber = Integer.parseInt(tmp1[0]);
        int penNumber = Integer.parseInt(tmp1[1]);
        int totalTshirtOrderNumber = 0;
        // 티셔츠 수 구하기
        for (String s : sizeCnt) {
            int i = (Integer.parseInt(s)) / tShirtNumber;
            int j = (Integer.parseInt(s)) % tShirtNumber;

            if (j == 0) {
                totalTshirtOrderNumber += i;
            } else {
                totalTshirtOrderNumber += i + 1;
            }
        }

        System.out.println(totalTshirtOrderNumber);

        System.out.printf("%d %d", participantCnt / penNumber,
                participantCnt % penNumber);
    }
}