package programmers.lv1.k번째수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arry = new int[sc.nextInt()];
        int[] arr = {1, 5, 2, 6, 3, 7, 4};

        //arry 원소입력
        for (int i = 0; i < arry.length; i++) {
            arry[i] = sc.nextInt();
        }
        //매개변수 cmd 3 -> i,j,k i부터 j까지 자르고 오름차순 정렬, k번째 숫자 출력

        int[] cmd = {2, 5, 3};

        for (int j = 0; j <= cmd[1] - cmd[0]; j++) {
            int st = cmd[j];
            int end = cmd[j + 1];
            int[] temp = new int[cmd[1] - cmd[0]];

            int k = 0;

            temp[k] = arr[st];
            k += 1;
        }
    }
}
