package baek_joon.class_2.소수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        while (n <= m) {

            if (isPrime(n) == true) {
                sb.append(n).append("\n");
            }
            n++;
        }
        System.out.println(sb.toString().trim());

    }

    /**
     * @Point
     * 88%에서 틀림
     * 소수는 1, 자기자신만 약수로 갖음 제곱근 전까지의 수들로 나눠 떨어진다? 소수가 아님
     * a * b 인 수가 있다는 말이기 때문임
     */
    private static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {

            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {


                return false;
            }
        }
        return true;
    }
}
