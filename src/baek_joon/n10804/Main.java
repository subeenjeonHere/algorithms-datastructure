package baek_joon.n10804;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[21];

        for (int i = 1; i < 21; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int mid = (b - a) / 2;

            for (int j = 0; j <= mid; j++) {
                int temp = arr[a + j];
                arr[a + j] = arr[b - j];
                arr[b - j] = temp;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}