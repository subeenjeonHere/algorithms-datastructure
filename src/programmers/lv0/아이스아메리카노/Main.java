package programmers.lv0.아이스아메리카노;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int mo = 15000;
        int co = 5500;
        int[] res;
        res = new int[]{mo / co, mo % co};

        System.out.println(Arrays.toString(res));
    }
}
