package demo.matrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {43, 35, 50},
                {36, 76, 37},
                {98, 25, 19}
        };
        // 1. 2차원 배열 크기만큼 1차원 배열 생성
        int[] arr = new int[9];
        // 2. 2차원 배열 값을 1차원 배열 저장
        int idx = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arr[idx] = matrix[i][j];
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr));
        StringBuilder sb = new StringBuilder();

        // 3. 1차원 배열 정렬 알고리즘으로 정렬
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        // 4. 1차원 배열 값을 2차원 배열에 재저장
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = arr[index];
                index++;
            }
        }
        System.out.println(Arrays.deepToString(matrix));


    }
}
