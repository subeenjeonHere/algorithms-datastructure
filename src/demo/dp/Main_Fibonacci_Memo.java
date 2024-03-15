package demo.dp;

public class Main_Fibonacci_Memo {
    public static void main(String[] args) {
        int n = 9;

        System.out.println(fibonacci(n));
    }

    static int fibonacci(int n) {
        //피보나치 값 저장하기 위한 배열
        int f[] = new int[n + 2];

        //피보나치 값의 0, 1은 0,1임
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}
