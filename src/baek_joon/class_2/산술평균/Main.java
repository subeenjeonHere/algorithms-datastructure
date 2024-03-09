package baek_joon.class_2.산술평균;

import demo.mergesort.MergeSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

import static java.io.ObjectInputFilter.merge;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine().trim());

            //산술평균
            avg += arr[i];
        }
        //평균
        avg = avg / arr.length;

        //정렬
        Arrays.sort(arr);
        // 중앙값
        int l = 0;
        int r = arr.length;
        int mid = (r - l) / 2;

        //최댓값
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = 0;
            if (arr[i] > max) {
                temp = arr[i];
                arr[i] = max;
                max = temp;
            }
        }
        //최댓값
        int maxVal = arr[arr.length - 1];

        //최빈값
        //계수정렬
        //음수 처리 주의
        int[] temp = new int[500000];
        int[] temp2 = new int[50000];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println("Arr:    " + arr[i]);
                temp2[-arr[i]]++;
            } else {
                System.out.println("Arr:    " + arr[i]);
                temp[arr[i]]++;
            }
        }


        System.out.println(Arrays.toString(arr));

    }


}
