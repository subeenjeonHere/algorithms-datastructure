package baek_joon.class_1;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class 별찍기_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        /**
         * 1
         * ----*
         * 2
         * ---**
         */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                sb.append(" ");
            }
            for (int k = 1; k <= i; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());

    }
}

