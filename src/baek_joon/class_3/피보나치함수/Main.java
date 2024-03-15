package baek_joon.class_3.피보나치함수;

import java.util.Scanner;

/**
 * @Point - 메모이제이션 활용 여부
 * - stackOverflow
 */
public class Main {
    static int zeroCount;
    static int oneCount;
    static int[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int tc = sc.nextInt();

        int result = 0;
        // 피보나치 call
        for (int i = 0; i < tc; i++) {

            int n = sc.nextInt();
            memo = new int[n + 1];
            fibonacci(n, memo);
            System.out.println(memo[0] + " " + memo[1]);


        }
    }

    private static int fibonacci(int n, int[] memo) {
        if (n <= 1) {
            return n;
        } else if (memo[n] != 0) {
            return memo[n];
        } else
            return memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
    }
}
