package baek_joon.class_3._1로만들기;

import java.util.Scanner;

/**
 * @Point 반례 100007 정답 21인데, 22나옴
 */
public class Main {
    static int res;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        res = 0;
        System.out.print(solve(n));
    }

    static int solve(int n) {

        if (n == 1) {
            return res;
        }
        if (n % 3 == 0) {
            res++;
            return solve(n / 3);
        }
        if (n % 2 == 0 && (n - 1) % 3 != 0) {
            res++;
            return solve(n / 2);
        }
        if (n % 2 == 0 && (n / 2) % 2 == 0) {
            res++;
            return solve(n / 2);

        } else {
            res++;
            return solve(n - 1);
        }
    }
}
