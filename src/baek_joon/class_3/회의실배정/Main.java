package baek_joon.class_3.회의실배정;

import javax.crypto.Cipher;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @Point 그리디
 * <p>
 * <p>
 * - -
 * 회의 개수 최대
 * 가장 일찍 끝나고 -> 가장 빨리 시작하는
 * 즉 회의와 회의 사이 간격을 최소화
 * 최적선택: 직전 행 종료 시간보다 크고, 진행되지 않은 회의 중 가장 빨리 시작하는 회의
 */
public class Main {

    static ArrayList<ArrayList<Integer>> arrayList;
    static ArrayList<ArrayList<Integer>> resultList;

    public static void main(String[] args) throws IOException {
        //N개 회의 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //회의 개수 입력받기
        int n = Integer.parseInt(br.readLine());

        //자료구조 할당
        arrayList = new ArrayList<ArrayList<Integer>>();
        resultList = new ArrayList<ArrayList<Integer>>();

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

        //전체 회의를 종료 시간 순으로 오름차순 정렬
        int max = arrayList.get(0).get(1);
        for (int i = 1; i < arrayList.size(); i++) {
            int temp = arrayList.get(i).get(1);
            if (max > temp) {
                max = temp;
            }
        }
        int max2 = arrayList.get(0).get(1);
        int temp = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                temp = arrayList.get(j).get(1);

                if (temp < max2) {


                }


            }
        }


        //가장 첫 번째 종료 회의를 인덱스에 넣어줌
        resultList.add(arrayList.get(0));

        int finalStart = arrayList.get(arrayList.size() - 1).get(0);


        //종료시간이 같은 경우, 시작 시간이 더 빠른 걸 선택하는 것이 유리함
        //if (i-1)회의 시작시간 < 종료시간 이라면 선택
        for (int i = 0; i < arrayList.size(); i++) {

            //항상 선택된 회의의 맨 마지막 기준
            int len = resultList.size();
            int e1 = resultList.get(len - 1).get(1);

            for (int j = 1; j < arrayList.size(); j++) {
                int s1 = arrayList.get(j).get(0);
                if (s1 >= e1) {
                    resultList.add(arrayList.get(j));
                    break;
                }


            }
            //시간초과 어떻게 해결
            //원래 시간표의 시작 시간보다 결과 배열의 종료시간이 더 커진다면 종료
            int len2 = resultList.size();
            int e2 = resultList.get(len2 - 1).get(1);

            if (finalStart <= e2) {
                break;
            }
        }
        System.out.print(resultList.size());
    }
}

