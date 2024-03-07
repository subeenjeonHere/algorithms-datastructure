package baek_joon.class_2.회의실배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //회의 수 n
        int n = sc.nextInt();

        //회의 시작 , 종료 시간
        int[][] time = new int[n][2];

        for (int i = 0; i < n; i++) {
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
        }

        //종료 시간이 빠른 순으로 정렬
        //2d 배열
        for (int j = 1; j < time.length; j++) {
            if (time[j - 1][1] > time[j][1]) {
                int temp = 0;
                temp = time[j - 1][1];
                time[j - 1][1] = time[j][1];
                time[j][1] = time[j - 1][1];
            }
        }
        System.out.println("len: " + time.length + " / len 2: " + time[1].length);
        //회의실 개수
        int room = 0;

        //종료 시간이 가장 빠른 순서로 겹치지 않게
//        for (int i = 1; i < time.length; i++) {
//            //수업시간
//            int during = time[i][1] - time[i][0];
//            System.out.println("수업 시간: " + during);
//
//            for (int j = 1; j < time.length; j++) {
//
//                //종료 시각이 다음 수업 시각보다 빠르고
//                //+1 하고 교체
//                if (time[i - 1][1] < time[j][0]) {
//                    System.out.println(time[i - 1][1] + " // " + time[j][0] + "//" + time[j][1]);
//                    room++;
//                    break;
//                }
//            }
//        }
        int i = 1;
        int j = 1;
        while (i < time.length) {
            System.out.println(time[i - 1][1]);

            if (time[i - 1][1] < time[i - 1][0]) {
                System.out.println(time[i - 1][1] + " // " + time[j][0] + "//" + time[j][1]);
                i++;
            }
            if (i == time.length) {
            }
        }

        System.out.println(room);
        //종료 시간 오름차순 , 가장 일찍 끝나면서 겹치지 않는 회의들 개수
        System.out.println(Arrays.deepToString(time));

    }
}
