package baek_joon.x03배열.두수의합;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //배열 생성
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //X 입력받기
        int x = sc.nextInt();

        //ASC 정렬
        Arrays.sort(arr);

        int cnt = 0;
        int start = 0;
        int end = 1;

        // a + b = x인 순서쌍 구하기, a < b
        // start가 arr 길이까지 올 떄
        while (end < arr.length) {
            if (arr[start] + arr[end] == x) {
                System.out.println(arr[start] + "  " + arr[end]);
                cnt++;
                start++;
                // 같은 후, end 복귀해줘야 함
                end = start + 1;
            } else if (arr[start] + arr[end] < x) {
                end++;
            } else {
                start++;
                end = start + 1;
            }
        }
        System.out.println(cnt);
    }
}
