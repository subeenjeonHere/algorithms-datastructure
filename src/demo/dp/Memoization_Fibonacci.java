package demo.dp;

public class Memoization_Fibonacci {
    // 메모이제이션 배열 기본값 0
    static long[] memo;

    public static long fibonacci(int n) {
        if (n <= 1)
            return n;
        // 이미 구한 피보나치 수라면, 구한 값을 반환
        else if (memo[n] != 0)
            return memo[n];
        else
            // 피보나치 수를 저장
            return memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        memo = new long[101];
        System.out.println(fibonacci(10));

    }
}
