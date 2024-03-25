package baek_joon.others.구간합구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;
import java.util.Arrays;

/**
 * @Point 구간합 골1
 */
public class Main {
    //n,m.k 입력 받기
    static long n;
    static long m;
    static long k;
    //원본배열
    static long[] arr;
    //누적합배열
    static long[] sarr;
    //구간합 결과 변수
    static long res;
    //abc
    static long a, b, c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //nmk 정수형 변환 저장
        String[] nmk = br.readLine().split(" ");
        n = Long.parseLong(nmk[0]);
        m = Long.parseLong(nmk[1]);
        k = Long.parseLong(nmk[2]);

        //원본 배열 할당
//        arr = new long[n + 1];
        arr = new long[(int) (n + 1)];
        //n개 숫자 입력 받기

        for (int i = 1; i < arr.length; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }
        //누적합 배열 할당
//        sarr = new long[n + 1];
        sarr = new long[(int) n + 1];

        //누적합 배열 1번 Idx는 동일
        sarr[1] = arr[1];

        //누적합 저장

        for (int i = 2; i < arr.length; i++) {
            sarr[i] = arr[i] + sarr[i - 1];
        }
        //몇 번?
        //N+2번째 줄부터 N+M+K+1번째 줄까지
        long cnt = (n + m + k + 1) - (n + 2);
        cnt += 1;

        for (int i = 0; i < cnt; i++) {
            //abc 입력받기
            //1은 숫자 바꿈, 2는 구간합 구하기
            String[] abc = br.readLine().split(" ");
            a = Long.parseLong(abc[0]);
            b = Long.parseLong(abc[1]);
            c = Long.parseLong(abc[2]);

            if (a == 1) {
                //원소 변경 메소드
                change(b, c);
            } else if (a == 2) {
                //구간합 메소드
                res = sumOfPart(b, c);
                sb.append(res).append("\n");

            }
        }
        System.out.print(sb.toString().trim());
    }

    //b 번째 원소를 c로 변경
    private static void change(long b, long c) {
        long change = c - arr[(int) b];
        //b번째부터 sarr 끝까지 누적합 변경해야 함
        for (long i = b; i < sarr.length; i++) {
            sarr[(int) i] = sarr[(int) i] + change;
        }
        arr[(int) b] = c;
    }

    //b번째부터 c번째 구간합
    private static long sumOfPart(long b, long c) {
        long result = 0;
        result = sarr[(int) c] - sarr[(int) (b - 1)];
        return result;
    }
}
