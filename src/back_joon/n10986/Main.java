package back_joon.n10986;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long answer = 0;
        long[] arr = new long[n];
        long[] crr = new long[m];
        //구간 합 배열 구하기
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1] + sc.nextInt();
        }
//        System.out.println(Arrays.toString(arr));

        // 구간 합 배열 모든 값에 나머지 연산 수행하기
        for (int i = 0; i < n; i++) {
            int remainder = (int) arr[i] % m;
            if (remainder == 0) answer++;
            crr[remainder]++;
        }

        for (int i = 0; i < m; i++) {
            if (crr[i] > 1) {
                answer = answer + (crr[i] * (crr[i] - 1) / 2);
            }
        }
        System.out.println(answer);
    }
}
