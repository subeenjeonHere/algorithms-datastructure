package baek_joon.class_2.벌집;

import java.util.Scanner;

/**
 * 벌집 형태 그래프에서 최소거리 찾기
 *
 * @Subject 등차수열 개념 이용
 * 벌집 그래프 각 층은 6 배수 만큼 증가함
 * 6 * 1 , 6 * 2, 6 * 3
 * 방 총 개수: 1, 7, 19, 37 ...
 * 벌집 육각형 구조 ->> 중앙에서 바깥으로 갈수록 각 층은 이전층보다 방 6개씩 더 많이 가지고 있음이 핵심
 * 따라서 등차수열의 형태를 띄는 것 ->> 첫 번째 층 방 1개, 두 번째 방 7개, 세 번째 방 19개....
 * 이런 패턴을 발견하면 방 번호 N이 몇 번째 층에 속하는지 -> 그 층에 도달하기 까지 몇 개의 방을 지나야 하는지 계산 가능
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            // 1인 경우
            if (n == 1) {
                System.out.println("1");
                return;
            }
            cnt += i;
            num = 6 * cnt;

            if (n <= num + 1) {
                System.out.println(i + 1);
                return;
            }
        }
    }
}
