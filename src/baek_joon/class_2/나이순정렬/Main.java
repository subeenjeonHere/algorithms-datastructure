package baek_joon.class_2.나이순정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[][] arr = new String[3][2];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = String.valueOf(sc.next());
            }
        }

        int min = Integer.parseInt(arr[0][0]);

        //2차원 배열 선택 정렬
        String temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i][0].equals(arr[j][0])) {
                    System.out.println("나이 같음");
                    System.out.println(" arr[i][0]: " + arr[i][0]);
                    System.out.println(" arr[j][0]: " + arr[j][0]);
                }
                if (arr[i][0].compareTo(arr[j][0]) > 0 && !arr[i][0].equals(arr[j][0])) {
                    System.out.println(i + " I : J " + j);
                    /**
                     * 나이 같으면 먼저 가입한 사람 앞에 옴
                     */
                    for (int k = 0; k < arr[i].length; k++) {
                        System.out.println(" arr[i][k]: " + arr[i][k]);
                        System.out.println("arr[j][k]: " + arr[j][k]);
                        temp = arr[i][k];
                        System.out.println("Temp: " + temp);
                        arr[i][k] = arr[j][k];
                        arr[j][k] = temp;
                    }
                }

//                int temp = 0;
//                System.out.println("arr[j][0]: " + arr[j][0]);
//                if (min > Integer.parseInt(arr[j][0])) {
//                    //[j][0] = 20
//                    // Now min = 21
//                    System.out.println("Min" + min);
//                    // 21 20 , 20을 temp, 21을 20자리, temp의 20을 21 자리
//                    temp = Integer.parseInt(arr[j][0]);
//                    arr[j][0] = String.valueOf(min);
//                    min = temp;
//
//
//                }
            }
        }

        for (int p = 0; p < arr.length; p++) {
            for (int q = 0; q < arr[p].length; q++) {
                System.out.print(arr[p][q] + " ");
            }
            System.out.println();
        }


        System.out.println(Arrays.deepToString(arr));
    }
}
