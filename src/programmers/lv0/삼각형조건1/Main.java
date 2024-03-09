package programmers.lv0.삼각형조건1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add((arr[i]));
        }
        int maxVal = 0;
        maxVal = Collections.max(list);
        list.remove(list.indexOf(maxVal));

        int sum = 0;
        for (int j = 0; j < list.size(); j++) {
            sum += list.get(j);
        }
        String answer = (sum > maxVal) ? "1" : "2";
        System.out.println(answer);
    }
}
/*
삼각형 조건
삼각형이 되기 위해선 세 변의 길이 중, 가장 긴 변의 길이가 < 나머지 두 변의 길이 합보다 무조건 작아야 한다.
 */
