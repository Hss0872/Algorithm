import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String inputStr = scanner.nextLine();
            if (inputStr.equals("0 0 0")) {
                break;
            }

            String[] strs = inputStr.split(" ");
            int[] arr = new int [strs.length];

            arr[0] = Integer.parseInt(strs[0]);
            for (int i = 1; i < strs.length; i++) {
                arr[i] = Integer.parseInt(strs[i]);

                // 오름차순
                if (arr[i-1] > arr[i]) {
                    swap(arr, i-1, i);
                }
            }

            if (arr[2] * arr[2] == (arr[1] * arr[1] + arr[0] * arr[0])) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}