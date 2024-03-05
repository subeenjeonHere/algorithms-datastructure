package baek_joon.others.n10808;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] sArr = s.toCharArray();
        char[] alph = new char[26];
        char[] result = new char[26];

        for (int i = 0; i < alph.length; i++) {
            alph[i] = (char) (65 + i);
        }

        for (int i = 0; i < sArr.length; i++) {
            for (int j = 0; j < alph.length; j++) {
                if (sArr[i] == alph[j]) {
                    result[j] += 1;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {


            System.out.println(result[i] + ' ');
        }
    }
}
