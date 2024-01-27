package back_joon.n1912;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        temp[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            temp[i] = Math.max(temp[i - 1] + arr[i], arr[i]);
            max = Math.max(temp[i], max);
        }
        System.out.println(max);
    }
}
