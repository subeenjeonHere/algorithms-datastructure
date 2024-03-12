package baek_joon.class_3.atm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //Asc 정렬
        Arrays.sort(arr);

        int sum = 0;
        int res = 0;
        int next = 0;

        for (int i = 1; i < arr.length; i++) {
            sum += arr[i - 1];
            next = arr[i] + sum;
            System.out.println("arr[i-1]: " + arr[i - 1] + " arr[i] : " + arr[i] + "/ sum : " + sum);
            System.out.println("Next: " + next);
            res += next;
        }
        int sum2 = 0;
        for (int i : arr) {
            sum2 += i * (n--);
            System.out.println(sum2);
        }
        System.out.println(res + arr[0]);
    }
}
