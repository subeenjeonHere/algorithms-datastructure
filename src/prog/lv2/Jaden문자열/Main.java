package prog.lv2.Jaden문자열;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String s = "3people unFollowed me";
        String s = "a    b";
        StringBuilder sb = new StringBuilder();
        String[] strings = s.split(" ");
        System.out.println(Arrays.toString(strings));

        for (int i = 0; i < strings.length; i++) {
            char myString = strings[i].charAt(0);
            System.out.println(strings[i].charAt(0));
            // 스페이스 여러 개인 경우 해결

            if (Character.isLowerCase(myString)) {
                String a = String.valueOf(myString).toUpperCase();
                String st = strings[i].substring(1, strings[i].length()).toLowerCase();
                sb.append(a).append(st).append(" ");
            } else if ((int) myString >= 48 && (int) myString <= 57) {
                String nums = String.valueOf(strings[i].charAt(1)).toLowerCase();


                String strings3 = strings[i].substring(1, strings[i].length()).toLowerCase();
                sb.append(myString).append(strings3).append(" ");
            }
        }
        s = sb.toString().trim();

        System.out.println(s);
    }
}
