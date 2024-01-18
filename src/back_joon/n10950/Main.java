package back_joon.n10950;

import java.util.Scanner;

/**
 * A+B 입력받은 다음, A+B 출력하는 프로그램 작성
 * T testCase 개수
 * 두 정수 A B 입력받고, A+B를 출력하는 프로그램 작성
 * 각 테케 한 줄로 이뤄짐, 각 줄에 A와 B가 주어짐
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int i = 0; i < tc; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }

    }
}
