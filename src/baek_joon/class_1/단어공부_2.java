package baek_joon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 단어공부_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //문자열 입력
        String[] myString = br.readLine().toUpperCase().split("");

        for (int j = 0; j < myString.length; j++) {
            sb.append(myString[j]).append(" ");
        }
        System.out.println(sb.toString());

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < myString.length; i++) {

            if (!map.containsValue(myString[i])) {
                map.put(myString[i], 1);
            } else {
                map.put(myString[i], map.get(myString[i]) + 1);
            }
        }

        //단어 빈도수 체크
        int count = 0;

        for (String key : map.keySet()) {
            sb.append(map.get(key)).append(" ");
        }
        System.out.println(sb.toString());


//        int start = 0;
//        while (stk.hasMoreTokens()) {
//
//            System.out.println(start);
//
//            if (start > stk.countTokens()) {
//                return;
//            }
//
//
//            for (int i = 0; i < stk.countTokens(); i++) {
//
//
//                char ele = String.valueOf(stk).charAt(i);
//
//
//                sb.append(ele).append(" ");
//            }
//
//            start++;
//        }

    }
}
