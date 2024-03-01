package baek_joon.class_2;

import java.util.Arrays;
import java.util.Scanner;

public class 부녀회장이될테야 {
    static int[] s3array;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        //14호까지 0층에 사람들을 채워준다
        int[] array = new int[14];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            sb.append(array[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
        System.out.println();

        //테스트 케이스
        int tc = sc.nextInt();
        // 누적합
        int[] sarray = new int[array.length];

        sarray[0] = array[0];
        System.out.println("1호: " + sarray[0]);
        System.out.println();
        StringBuilder sb2 = new StringBuilder();

        //누적합을 반복
        // 2층이면 1, 2 까지 수행해야 함
        int k1 = 1;
        int n1 = 3;
        int k2 = 2;
        int n2 = 3;


            for (int st = k1; st <= k2; st++) {

                s3array = new int[array.length];
                s3array[0] = array[0];
                //1층 누적합

                for (int i = 1; i < array.length; i++) {
                    s3array[i] = s3array[i - 1] + array[i];
                }
                array = s3array;
                System.out.println("3: " + Arrays.toString(s3array));
            }
        }
    }
