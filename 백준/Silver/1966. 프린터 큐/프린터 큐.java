import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static class MyQueue {
        private int[] queue;
        private final int MAX_SIZE;
        private int front = 0;
        private int rear = 0;

        public MyQueue(int sizeParam) {
            MAX_SIZE = sizeParam;
            queue = new int[MAX_SIZE];
        }

        public void push(int num) {
            queue[rear] = num;
            rear = (rear + 1) % MAX_SIZE;
        }

        public int pop() {
            int result = queue[front];
            front = (front + 1) % MAX_SIZE;
            return result;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        int testCnt = Integer.parseInt(temp);

        for (int i = 0; i < testCnt; i++) {
            String temp1 = scanner.nextLine();
            String[] docuInfo = temp1.split(" ");
            int docuCnt = Integer.parseInt(docuInfo[0]);
            int goalPtr = Integer.parseInt(docuInfo[1]);

            MyQueue queue = new MyQueue(docuCnt);
            temp1 = scanner.nextLine();

            if (docuCnt == 1) {
                System.out.println(1);
            } else {
                String[] nums = temp1.split(" ");
                int[] tempArr = new int[nums.length];
                for (int j = 0; j < nums.length; j++) {
                    queue.push(Integer.parseInt(nums[j]));
                    tempArr[j] = Integer.parseInt(nums[j]);
                }

                Arrays.sort(tempArr);

                int printCnt = 0;
                while (true) {
                    int num = queue.pop();

                    if (num == tempArr[docuCnt - 1]) {
                        printCnt++;
                        docuCnt--;
                        if (goalPtr == 0) {
                            System.out.println(printCnt);
                            break;
                        }

                    } else {
                        queue.push(num);
                    }

                    goalPtr = (goalPtr - 1);
                    if (goalPtr == -1) {
                        goalPtr = docuCnt - 1;
                    }
                }
            }
        }
    }
}