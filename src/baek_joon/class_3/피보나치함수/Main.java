package baek_joon.class_3.피보나치함수;

import java.util.Scanner;

/**
 * @Point - 피보나치 메모이제이션 0,1 호출될 때 어떻게 카운트 할 것인지
 */
public class Main {
    static int res0;
    static int res1;
    static int[] memo;
    static int[] count;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        for (int i = 1; i <= tc; i++) {
            res0 = 0;
            res1 = 0;

            int n = sc.nextInt();
            memo = new int[n + 1];
            count = new int[n + 1];
            fibonacci(n);
            System.out.println(res0 + " " + res1);

//            if (n == 0) {
//                System.out.println(count[0] + " " + "0");
//            } else if (n == 1) {
//                System.out.println("0" + " " + count[1]);
//            } else {
//                System.out.println(count[0] + " " + count[1]);
//            }

        }
    }

    private static int fibonacci(int n) {
//        count[n] += 1;
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2);

        if (n <= 1) {

            if (n == 0) {
                res0 += 1;
            } else if (n == 1) {
                res1 += 1;
            }

            return n;
        } else if (count[n] != 0) {
            return count[n];
        }
        return count[n] = fibonacci(n - 1) + fibonacci(n - 2);

        // 메모이제이션 배열 초기화되지 않았다면
//        if (n <= 1) {
//            return n;
//        } else if (memo[n] != 0) {
//            return memo[n];
//        } else
//            return memo[n] = fibonacci(n - 1) + fibonacci(n - 2);

//        if (n == 0) {
//            res0 += 1;
//            return 0;
//        } else if (n == 1) {
//            res1 += 1;
//            return 1;
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
