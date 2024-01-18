package back_joon.n2587;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int avg = 0;
//        int mid = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            avg += arr[i] / 5;
        }
//        mid = arr[3];
        System.out.println(avg);
        Arrays.sort(arr);
        System.out.println(arr[2]);
        sc.close();
    }
}