package baek_joon.class_2.부녀회장이될테야;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[15];
        //1호
        for (int j = 1; j < arr.length; j++) {
            arr[j] = j;
        }
        System.out.println(Arrays.toString(arr));

        //결과
        int temp = 0;
        //2층 3호
        //테케입력
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            //층, 호수 입력
            int k = sc.nextInt();
            int n = sc.nextInt();

            //1층의 1,2,3호 합
            //2층이면 1,2 까지 구해야 함
            //1층이면 1,3,6일 것
            int st = 1;
            while (st <= n) {
                temp += arr[st];
                st++;

            }

        }

    }
}
