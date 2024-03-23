package baek_joon.class_3._1로만들기;

import java.util.Scanner;

/**
 * @Point 반례 100007 정답 21인데, 22나옴
 */
public class Main {
    static int res;
    static int[] dp;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        res = 0;

        dp = new int[100001];
        System.out.print(solve(n));
    }

    static int solve(int n) {

        if (n == 1) {

        }

        int three = n / 3;
        int two = n / 2;
        int minOf = Math.min(three, two);


        if (minOf == three) {
            res++;
            return solve(minOf / 3);
        } else if (minOf == two) {
            res++;
            return solve(minOf / 2);
        }


//        if (n == 1) {
//            return res;
//        }
//        if (n % 3 == 0) {
//            res++;
//            return solve(n / 3);
//        }
//        if (n % 2 == 0 && (n - 1) % 3 != 0) {
//            res++;
//            return solve(n / 2);
//        }
//        if (n % 2 == 0 && (n / 2) % 2 == 0) {
//            res++;
//            return solve(n / 2);
//        } else {
//            res++;
//            return solve(n - 1);
//        }
    }
}
// 3으로 우선적으로 나누도록 했는데, 이게 최소임을 보장하지 않는다
