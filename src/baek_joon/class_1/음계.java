package baek_joon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 음계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[stk.countTokens()];

        //배열 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());

//            if (i + 1 == arr[i]) {
//                System.out.println("Ascending");
//            } else if (arr.length - 1 - i == arr[i]) {
//                System.out.println("Descending");
//            } else {
//                System.out.println("Mixed");
//            }
        }
/**
 * 12346678이면 asc
 * 87654321이면 desc
 * +1씩 증가하는 것에 포인터
 *
 */
        int go = 1;
        int asc = 0;
        int desc = 0;
        int mix = 0;
        //len 8

        while (go < arr.length) {
            if (arr[go - 1] < arr[go]) {
                // 01, 12, 23, 34, 45, 56, 67
                asc++;

            }
            if (arr[0] == 8 && arr[go - 1] > arr[go]) {
                desc++;
            }
            go++;
        }

        if (asc == 7) {
            System.out.println("ascending");
        } else if (desc == 7) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }


    }
}
