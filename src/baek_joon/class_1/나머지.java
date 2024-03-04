package baek_joon.class_1;

import java.io.IOException;

import java.util.Arrays;
import java.util.Scanner;


public class 나머지 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        //개수 저장할 배열
        int[] count = new int[42];

        //배열 값 저장
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {

            count[arr[i] % 42]++;
        }

        for (int x = 0; x < count.length; x++) {
            if (count[x] > 0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
