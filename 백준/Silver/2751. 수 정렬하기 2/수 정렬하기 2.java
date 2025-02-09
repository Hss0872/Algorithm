import java.io.*;


public class Main {

    private static int[] sorted;

    private static void solve() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int numberCnt = Integer.parseInt(bf.readLine());

        int[] numArr = new int[numberCnt];

        for (int i = 0; i < numberCnt; i++) {
            numArr[i] = Integer.parseInt(bf.readLine());
        }

        sorted = new int[numberCnt];

        mergeSort(numArr, 0, numberCnt - 1);

        for (int i = 0; i < numberCnt; i++) {
            sb.append(numArr[i]);
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void mergeSort(int[] numArr, int left, int right) {
        if (left == right) {
            return;
        }

        int mid = (left + right) / 2;

        mergeSort(numArr, left, mid);
        mergeSort(numArr, mid + 1, right);

        merge(numArr, left, mid, right); // 병합 작업
    }

    private static void merge(int[] numArr, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int idx = left;     // 채워넣을 배열의 인덱스

        while (l <= mid && r <= right) {

            if (numArr[l] <= numArr[r]) {
                sorted[idx] = numArr[l];
                idx++;
                l++;
            } else {
                sorted[idx] = numArr[r];
                idx++;
                r++;
            }
        }
        
        if (l > mid) {
            while (r <= right) {
                sorted[idx] = numArr[r];
                idx++;
                r++;
            }
        }
        
        else {
            while (l <= mid) {
                sorted[idx] = numArr[l];
                idx++;
                l++;
            }
        }

        for (int i = left; i <= right; i++) {
            numArr[i] = sorted[i];
        }
    }

    public static void main(String[] args) throws Exception {
        solve();
    }
}