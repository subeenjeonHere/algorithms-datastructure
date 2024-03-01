package baek_joon.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class 부녀회장이될테야 {
    static int[] s3array;
    static int k;
    static int n;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //14호까지 0층에 사람들을 채워준다
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        //테스트 케이스

//        int[] s3array = new int[array.length];
        int tc = sc.nextInt();

        for (int x = 1; x <= tc; x++) {
            k = sc.nextInt();
            n = sc.nextInt();

            //3층이면 1,2,3 누적합을 구해와야 함
            for (int st = 1; st <= k; st++) {
                s3array = new int[array.length];

                //누적합의 0번은 원본 0번째와 항상 동일하므로 초기화
                s3array[0] = array[0];
                //1층 누적합
                for (int i = 1; i < 14; i++) {
                    s3array[i] = s3array[i - 1] + array[i];
                }
                array = s3array;

                System.out.println(Arrays.toString(s3array));
                sb.append(s3array[n - 1]).append("\n");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
