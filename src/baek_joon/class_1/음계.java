package baek_joon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 음계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[stk.countTokens()];

        //배열 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        //값 비교
        int start = 1;
        int max = arr[0];
        while (start < arr.length && max != arr[start]) {
            if (arr[start] > arr[start - 1]) {
                if (arr[start] < arr[start - 1]) {
                    System.out.println("mixed");
                    return;
                }
                System.out.println("ascending");

            } else if (arr[start] < arr[start - 1] && max == arr[start]) {
                System.out.println("descending");
            }
            start++;
        }
    }
}
