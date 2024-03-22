package baek_joon.class_3.피보나치함수;

import java.util.Scanner;

/**
 * @Point -
 * -
 * - 피보나치 메모이제이션 0,1 호출될 때 어떻게 카운트 할 것인지
 */
public class Main {

    //메모이제이션 배열
    static int[] memo;
    static int[] count;

    //카운팅
    static int res_0;
    static int res_1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //테스트 케이스 개수
        int tc = sc.nextInt();

        for (int i = 0; i <= tc; i++) {

            int n = sc.nextInt();
            memo = new int[n + 1];
            count = new int[n + 1];

            //피보나치 0과 1은 무조건 0,1이므로 미리 할당
            memo[0] = 0;
            //0, 1 몇 번 호출됐는지 출력할 카운트 초기화
            res_0 = 0;
            res_1 = 0;

            fibonacci(n);
            System.out.println(res_0 + " " + res_1);

        }
    }

    //피보나치 구하기
    //피보나치 재활용할 배열을 0으로 셋해두고, 만약에 0이 아니라면 값이 채워져있기에 재활용 할 수 있다는 것
    //메모 배열에 피보나치 저장이 우선
    //메모 배열이 != 0 이라면, 즉 재활용 할 수 있다면 해당 값 린턴
    private static int fibonacci(int n) {

        //0과 1이 오면, 메모 배열의 0,1을 리턴해줌
        //0이면 memo 0 리턴

        if (n == 0) {
            res_0 += 1;
            return memo[n];
        } else if (n == 1) {
            res_1 += 1;
            memo[n] = 1;
            return memo[n];
        }
        if (memo[n] != 0) {
            return memo[n];
        } else {
            //만약 메모이 제이션 되지 않았다면
            int val = fibonacci(n - 1) + fibonacci(n - 2);
            memo[val] = val;
            return val;
        }
    }
}
//피보나치 3을 호출하면
// 1. 2 + 1
// 1.1. 1 + 0
//여기서 1.1의 1을 재활용 할 수 있다.