package baek_joon.others.n3273;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int start = 0;
        int end = 1;
        int sum = arr[start] + arr[end];
        int count = 0;

        while (end < arr.length) {
            if (sum < x) {

                sum = sum - arr[end];
                end++;
            } else if (sum > x) {

                sum = sum - arr[end];
                end++;
            } else {

                sum = sum - arr[end];
                count++;
            }
        }
        System.out.println(count);
    }
}
