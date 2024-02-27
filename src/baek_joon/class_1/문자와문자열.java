package baek_joon.class_1;

import java.util.Scanner;

public class 문자와문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int num = sc.nextInt();

        String s = String.valueOf(string.charAt(num - 1));
        System.out.println(s);


    }
}
