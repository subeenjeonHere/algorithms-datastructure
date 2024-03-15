package baek_joon.class_3.피보나치함수;

import java.util.Scanner;

public class Main_2 {
    static int res0;
    static int res1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        for (int i = 1; i <= tc; i++) {
            res0 = 0;
            res1 = 0;
            int n = sc.nextInt();
            fibonacci(n);
            System.out.println(res0 + " " + res1);
        }
    }

    private static int fibonacci(int n) {

        if (n == 0) {
            res0 += 1;
            return 0;
        } else if (n == 1) {
            res1 += 1;
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
