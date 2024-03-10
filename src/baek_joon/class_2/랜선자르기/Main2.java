package baek_joon.class_2.랜선자르기;

import javax.xml.stream.events.StartDocument;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Long.MAX_VALUE;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int k = Integer.parseInt(stk.nextToken());
        int n = Integer.parseInt(stk.nextToken());

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int left = 1;
        int right = max;

        while (left <= right) {
            int mid = (left + (right - left)) / 2;

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i] / mid;
            }
            System.out.println("합계: " + sum);

            if (sum > n) {
                left = mid + 1;
            } else if (sum < n) {
                right = mid - 1;
            } else {
                System.out.println(mid);
                break;
            }
        }
    }
}
