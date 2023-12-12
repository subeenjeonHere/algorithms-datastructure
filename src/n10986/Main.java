package n10986;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //수열의 개수
        int n = sc.nextInt();
        //나누어 떨어져야 하는 수
        int m = sc.nextInt();
        // S 합배열 선언하기
        long answer = 0;
        long[] s = new long[n];
        // C 같은 나머지의 인덱스를 카운트하는 배열
        long[] c = new long[n];
        // 합배열 저장
        for (int i = 1; i < s.length; i++) {
            s[i] += s[i - 1] + sc.nextInt();
        }
        for (int i = 0; i < s.length; i++) {//합배열에 % 연산 수행
            int remainder = (int) (s[i] % m);
            // ₩₩0~i 까지 구간합 자체가 0일 때 정답에 더하기
            if (remainder == 0)
                answer++;
            //나머지 같은 인덱스의 개수 카운팅하기
            c[remainder]++;
        }

        for (int i = 0; i < m; i++) {
            if (c[i] > 1) {
                answer = answer + (c[i] * (c[i] - 1) / 2);  // C[i] (i가 나머지인 인덱스의 개수)에서, 2가지를 뽑는 경우의 수를 정답에 더하기
            }
        }
        System.out.println(answer);
    }
}
