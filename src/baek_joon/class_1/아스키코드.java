package baek_joon.class_1;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class 아스키코드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.next();

        char myChar = myString.charAt(0);
        System.out.println((int) myChar);


    }
}
