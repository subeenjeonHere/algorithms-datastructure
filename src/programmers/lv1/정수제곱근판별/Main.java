package programmers.lv1.정수제곱근판별;

public class Main {


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        int n = 121;
        boolean flag = false;

        isPrime(7);
        System.out.println(sb.toString());
    }

    static void isPrime(int x) {
        if (x == 0 || x == 1) {
            System.out.println("0,1은 소수가 아님");
            return;
        }
        if (x == 2) {
            System.out.println("2는 소수임");
            return;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                System.out.println("0으로 나눠떨어지는 값이 있으니, " + x + ":소수가 아님");
                return;
            }
        }
        System.out.println(x + ": 는 소수임");
    }
}
