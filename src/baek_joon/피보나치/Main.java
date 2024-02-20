package baek_joon.피보나치;

import java.util.Arrays;

/**
 * An = An-1 + An-2
 */
public class Main {
    public static void main(String[] args) {

        int[] arr = new int[100];
        arr[1] = 1;
        arr[2] = 3;
        System.out.println(arr[1] + arr[2]);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));
        int[] pbnc = new int[100];

        for (int i = 0; i < arr.length; i++) {

        }

    }

}
