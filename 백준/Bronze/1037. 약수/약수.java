import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int measureCnt = Integer.parseInt(scanner.nextLine());
        String inputString = scanner.nextLine();
        String[] strings = inputString.split(" ");
        
        int[] measures = new int[measureCnt];

        measures[0] = Integer.parseInt(strings[0]);
        for (int i = 1; i < measureCnt; i++) {
            // 오름차순 정렬
            measures[i] = Integer.parseInt(strings[i]);
            for (int j = i; j > 0; j--) {
                if (measures[j] < measures[j-1]) {
                    swap(measures, j, j-1);
                }
            }
        }

        if (measureCnt % 2 == 0) {
            // 짝수인 경우, 가장 큰 값과 가장 작은 값 곱하기
            System.out.println(measures[0] * measures[measureCnt - 1]);

        } else {
            // 홀수인 경우, 중간값 제곱
            System.out.println(measures[(measureCnt - 1) / 2] * measures[(measureCnt - 1) / 2]);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}