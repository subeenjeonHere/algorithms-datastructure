package baek_joon.class_2.설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * N킬로그램 배달
 * 3, 5 kg 봉지
 * 최대한 적은 봉지로 배달
 * 18kg 있다면, 5kg 3개 3kg 1개
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        // 18kg일 대 5 3, 3 1
        // 4kg일 때 옮길 수 없으므로 -1
        //  6kg면 1
        // 11키로면 5 1, 3 2
        int k1 = 5;
        int k2 = 3;
        if (n % k2 != 0 && n % k1 != 0) {
            System.out.println("-1");
        }




    }
}
