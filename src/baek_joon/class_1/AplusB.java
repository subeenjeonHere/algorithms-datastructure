package baek_joon.class_1;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 클래스밀기 A+B
 */
public class AplusB {
    static int a;
    static int b;
    static int sum;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            sum = plus(a, b);

            System.out.println(sum);

        }

//        sum = 1;
//        //테케 개수 안주어질 때 for문 반복 범위
//        while (sum != 0) {
//
//            int sum = plus(a = sc.nextInt(), b = sc.nextInt());
//            if (sum == 0) {
//                return;
//            }
//            System.out.println(sum);
//        }

    }

    static int plus(int a, int b) {
        return a + b;
    }
}
