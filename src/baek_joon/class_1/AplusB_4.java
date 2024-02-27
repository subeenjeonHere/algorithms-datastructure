package baek_joon.class_1;

import java.util.Scanner;

public class AplusB_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = plus(a, b);
            sb.append(sum).append("\n");
        }
        System.out.println(sb.toString().trim());
    }

    static int plus(int a, int b) {
        return a + b;
    }
}
