package baek_joon.others.n1463;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        if (n % 2 == 1) {
            System.out.println("1");
        } else if (n % 2 == 0) {
            if (n % 3 == 1) {
                System.out.println("1");
            } else {

            }


        }

    }
}
/**
 * 3으로 나눠떨어지면 3으로 나눈다
 * 2로 나눠떨어지면 2로 나눈다
 * 1을 뺀다
 * 세개연산을 사용해서 1을 만들수있는 횟수의 최솟값
 * 10의 경우 10 9 3 1 로 3번만에 만들수있다
 * 11의 경우 11 1 2로 나누면 1번만에 만들수있다
 * 13의 경우 13 1 2로 나누면 1번만에 만들수있다.
 * 즉, n이 홀수이면 2로 나누면 나머지 무조건 1이니까.
 * 홀짝개념으로 접근 , 홀수 연산 횟수는 무조건 1임.
 * 3의 경우 3 1 (이건 2로 나눠서)
 * 짝수일때가 관건, 3, 2, 1 -. 1로 갈 수있는 가장 빠른 방법은
 * 4 1 (3으로 나누면 1)
 * 10 9 3 1 (1빼고 > 3으로 나누고 > 2로 나누면 1)
 * 8 7 1 (1 빼고 -> 2로 나누면 -> 1)
 */