package baek_joon.others.n2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int st = 0;
        int end = 0;
        int count = 1;
        int sum = 1;

        while (end != n-1) {
            if (sum > n) {
                sum = sum - arr[st];
                st++;
            } else if (sum < n) {
                end++;
                sum = sum + arr[end];
            } else {
                count++;
                end++;
                sum = sum + arr[end];
            }
        }
        System.out.println(count);
    }
}
