package programmers.lv1.행렬의덧셈;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[][] arr1 = new int[][]{{1, 2}, {2, 3}};
//        int[][] arr2 = new int[][]{{3, 4}, {5, 6}};
        // 0,0 0,1 1,0 1,1

        int[][] arr1 = new int[][]{{1, 2}};
        int[][] arr2 = new int[][]{{3, 4}};

        int[][] sum = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Arr1 I는 : " + Arrays.toString(arr1[i]));
            System.out.print("Arr2 I는 : " + Arrays.toString(arr2[i]));
            System.out.println();

            for (int j = 0; j < arr1[i].length; j++) {
                int num = arr1[i][j];
                int num2 = arr2[i][j];

                System.out.println("Arr1 J까지와서// " + num);
                System.out.println("Arr2 J까지와서// " + num2);
                System.out.println("길이:  " + arr1[i].length);

                sum[i][j] = arr1[i][j] + arr2[i][j];

                System.out.printf("sum// " + sum[i][j]);
                System.out.println();

            }
        }
        System.out.println(Arrays.deepToString(sum));


    }
}
