package n2018;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int st = 0;
        int end = 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        while (end != n) {
            if (arr[st] + arr[end] == n) {
                count++;
                end++;
            } else if (arr[st] + arr[end] < n) {
                end ++;
            }
        }

    }
}