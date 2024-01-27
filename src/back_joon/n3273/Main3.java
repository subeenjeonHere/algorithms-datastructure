package back_joon.n3273;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = st.countTokens();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int x = Integer.parseInt(br.readLine());

        int count = 0;
        int start = 0, end = n - 1;

        while (end != n - 1) {
            int temp = arr[start] + arr[end];

            if (temp == x) {
                count++;
                start++;
            } else if (temp < x) {
                end++;
            } else {
                start++;
            }
        }
        System.out.println(count);
    }
}
