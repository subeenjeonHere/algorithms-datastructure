package baek_joon.class_3.회의실배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Point 그리디
 * 회의 개수 최대
 * 가장 일찍 끝나고 -> 가장 빨리 시작하는
 * 즉 회의와 회의 사이 간격을 최소화
 * 최적선택: 직전 행 종료 시간보다 크고, 진행되지 않은 회의 중 가장 빨리 시작하는 회의
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //N개 회의 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //회의 개수 입력받기
        int n = Integer.parseInt(br.readLine());
        //자료구조 할당
        //2차원 배열 회의 시간 저장
        int[][] time = new int[n + 1][2];
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();

        //리스트에 행 할당, 회의 시간표 저장
        for (int i = 0; i < n; i++) {
            arrayList.add(new ArrayList<>());

            String[] info = br.readLine().split(" ");
            int st = Integer.parseInt(info[0]);

            arrayList.get(i).add(st);

            for (int j = 0; j < 1; j++) {
                int end = Integer.parseInt(info[1]);
                arrayList.get(i).add(end);

            }
        }

        System.out.println(arrayList);


        //0번 인덱스 종료시간 가장 작은 것 할당

        //1: 0번 종료시간 다음으로 가장 빠른 시작시간
        //2: 1번 종료시간 다음으로 가장 빠른 시작시간

        //2차원 배열에 저장된 시작시간 행 중 최솟값
        //for 1부터 2차원 배열 시작시간 행 끝까지
        // if 전 인덱스 종료시간 보다 크고, 사용되지 않았다면

        //리스트 추가


        //리스트 사이즈 출력

        // 회의 시작 = 끝 같은 경우 고려


    }
}

