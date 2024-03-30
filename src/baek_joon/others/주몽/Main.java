package baek_joon.others.주몽;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static int sum;
    static int cnt;
    static String num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = 0;
        m = 0;
        sum = 0;
        cnt = 0;
        num = "";

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        StringTokenizer stk;
        String[] nums = br.readLine().split(" ");
        int[] number = new int[n + 1];
        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(nums[i]);
        }

        //정렬
        Arrays.sort(number);


        int left = 1;
        int right = number.length - 1;

        while (left < right) {
            int a = number[left];
            int b = number[right];

            sum = a + b;
            if (sum < m) {
                left++;
                sum = 0;
            } else if (sum == m) {
                cnt++;
                right--;
                sum = 0;
            } else if (sum > m) {
                right--;
                sum = 0;
            }
        }
        System.out.print(cnt);

    }
}
