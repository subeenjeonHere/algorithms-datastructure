package baek_joon.class_2.랜선자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Review 반복 범위
 * <p>
 * 웬만한 테케 통과하는데 몇몇 반례의 +1로 출력됨
 * 왜 최댓값부터 접근해야 하는지
 */
public class Main {
    //k랜선 저장 배열
    static int[] arr;
    //k,n
    static int k, n;
    //랜선 개수 체크 카운팅 변수
    static long count;
    //최소, 최대값
    static long min, max;
    //중간값
    static long mid;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //K, N 입력받기
        //갖고있는 랜선 K, 필요한 랜선 N
        String[] kn = br.readLine().split(" ");
        k = Integer.parseInt(kn[0]);
        n = Integer.parseInt(kn[1]);

        //K 줄에 갖고 있는 랜선 길이 입력
        //배열 할당
        arr = new int[k];

        min = 1;
        max = Long.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.print(BS());
    }

    private static long BS() {
        //중간값
        mid = 0;
        while (min <= max) {
            //랜선개수
            count = 0;
            //중간값 찾기
            mid = min + (max - min) / 2;
            for (int i = 0; i < arr.length; i++) {
                count += arr[i] / mid;
            }
            if (count < n) {
                max = mid - 1;
            } else if (count >= n) {
                min = mid + 1;
            }
        }
        //이 부분 왜 그런지 복습
        return Math.min(mid, min - 1);
        /**
         * Right - 처음에 랜선의 Max로 설정함
         * while 문 종료 직후, left, right 가지는 값은 ==> 1 이상 Max 이하임
         * 그러면 코드가 출력할 수 있는 값은 0 이상, Max -1 이하임 왜냐면 While문이 종료되기 때문
         * UpperBound임 주의
         */
    }
}