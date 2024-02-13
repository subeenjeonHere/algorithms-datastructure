package back_joon.카드;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[n];
        //Increase idx count
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }
        //temp 배열의 max인 idx를 출력해주면 됨
        int max = temp[0];
        int idx_max = 0;
        for (int i = 0; i < temp.length; i++) {
            int num;
            if (max < temp[i]) {
                num = max;
                max = temp[i];
                temp[i] = num;
                idx_max = i;
            }
        }
        System.out.println(idx_max);
    }
}
