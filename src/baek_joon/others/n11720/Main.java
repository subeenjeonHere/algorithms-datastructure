package baek_joon.others.n11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // String에 저장
        String sNum = br.readLine();
        //char 배열로 변환하기
        char[] cArr = new char[n];
        cArr = sNum.toCharArray();
        int sum = 0;
        for (int i = 0; i < cArr.length; i++) {
            sum += cArr[i] - '0';
        }
        System.out.println(sum);
    }
}
