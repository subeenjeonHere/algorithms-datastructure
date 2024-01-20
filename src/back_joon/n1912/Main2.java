package back_joon.n1912;

import java.util.Scanner;

public class Main2 {

    static int max;
    static int[] arr;
    static Integer[] dp;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        arr = new int[n];
        dp = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //최댓값 초기화 arr[0]은 dp[0]과 동일하므로
        dp[0] = arr[0];
        max = dp[0];
        recur(n - 1);
    }

    public static int recur(int n) {
        // recur 메소드 내에서 어떻게 구현?

        // dp 배열에 어떻게 값을 채워넣을 것인가? dp(0)은 이미 arr(0)이다,
        // dp(1)은 dp(0)+arr(1) 할건지, arr(1) 인지 max를 선택해야 한다.

        if (dp[0] == null) {
        }
        return null;
    }
}
