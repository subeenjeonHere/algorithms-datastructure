package baek_joon.class_2.부녀회장이될테야;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    static int[] s3array;
    static int k;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 0층 1- 14호 사람 채운다
        int[] array = new int[15];

        /**
         * a/t
         * 3층 3호 사람 수를 구하기 위해 누적합을 0층부터 차례로 구해야 하는지
         * 호를 다른 방법으로 구할 수 있는지 체크
         */
        int tc = sc.nextInt();
        s3array = new int[15];

        for (int i = 1; i <= tc; i++) {

            int k = sc.nextInt();
            int n = sc.nextInt();

            int start = 1;
            for (int p = 0; p < array.length; p++) {
                array[p] = p + 1;
            }
            s3array[0] = array[0];

            while (start <= k) {
                System.out.println("START: " + start);
                for (int x = 1; x <= array.length; x++) {
                    if (x > n) {
                        break;
                    }
                    s3array[x] = s3array[x - 1] + array[x];
                }
                array = s3array;
                //누적합으로 반복하니 sb에 전체 추가됨, 3층 10호일 땐 3층 10호만 count 해야하는데 1,2층까지 같이 count
                start++;
            }
            sb.append(s3array[n - 1]).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
