package baek_joon.class_2;

import java.util.Scanner;

public class 부녀회장이될테야 {
    public static void main(String[] args) {
        // 2차원 배열로
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int tc = sc.nextInt();

        //tc층까지 있다. i호에는 i명이 살고있다.
        //1~14호까지 있다
        int[][] arr = new int[tc][14];

        //1층에 사람들을 채워준다
        for (int i = 1; i <= arr[0].length; i++) {
            arr[0][i - 1] = i;
            sb.append(arr[0][i - 1]).append(" ");
        }
        System.out.println("1층:  " + sb.toString().trim());

        int k = 1;
        int n = 3;
        int sum = 0;
        for (int start = 1; start <= n; start++) {
            sum += arr[k - 1][start];
            System.out.println("누적합: " + sum);
        }
        System.out.println("몇 명 ? " + sum);


    }
}