package prog.lv2.가장큰수;

import java.util.Arrays;

public class Solution {
    public static String main(String[] args) {

        // 정수 -> 문자열로 변환
        int[] numbers = {3, 30, 34, 5, 9};
        String[] res = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            res[i] = String.valueOf(numbers[i]);
        }

        // 정렬
        Arrays.sort(res, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        if (res[0].equals("0")) {
            return "0";
        }
        return null;
    }
}

