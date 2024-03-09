package programmers.lv0.최빈값구하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                temp[i] = count;
            }
        }
        int max = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (max < temp[i]) {
                max =
                        temp[i];
            }

        }
        System.out.println(max);
    }
}
