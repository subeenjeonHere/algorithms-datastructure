package baek_joon.class_2.랜선자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @Sec 랜선자르기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int k = Integer.parseInt(stk.nextToken());
        int n = Integer.parseInt(stk.nextToken());
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result = findMax(n, arr);
        //max 길이를 조정하며
        //N개가 구해질 때
        //N개가 구해지지 않을 때
    }

    private static int findMax(int n, int[] arr) {
        //랜선의 최대 길이
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }
        int max = temp / n;
        //초깃값 231

        //max로 각 랜선들을 나누었을 때, 그 몫이 11이 되어야 함
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] / max;
        }
        if (result < n) {
            findMax(n, arr);
        } else{
        }
        return max;
    }
}


