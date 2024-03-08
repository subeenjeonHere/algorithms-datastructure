package baek_joon.class_2.설탕배달;

import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int count_3 = 0;
        int count_5 = 0;

        // 5의 배수일 경우
        // 18일 때 6이 출력되어 버리는 경우가 있다.
        // 5를 빼면서 3으로 나눠 떨어질 경우를 체크해야 함

        while (true) {
            result = n - 5;
            System.out.println("Result : " + result);
            // ex 18 -5 -5 -5 3이 남으면
            if (result % 3 == 0) {
                System.out.println("Result % 3: " + result % 3);
                //5 사용 개수
                count_5 = (n - result) / 5;
                //3 사용개수
                count_3 = result / 3;
                System.out.println(count_3 + count_5);
                return;
            } else {

                break;
            }
        }

        //3의 배수인 경우
        if (n % 3 == 0) {
            result = n / 3;
            System.out.println(result);
        }
        // 임시값
        int temp = 0;
        // n에서 5를 빼본다
        temp = n - 5;
        System.out.println("Temp%3: " + temp % 3);
        // 11 ; 6 % 3 나눴을 때 나머지가 0이 아니라면 다시 5를 빼본다

        while (temp % 3 != 0) {
            if (temp % 3 == 0) {

                System.out.println("Temp: " + temp);

                count_3 = temp / 3;
                count_5 = (n - temp) / 5;
                result = count_3 + count_5;

                System.out.println(result);
            }
            temp = temp - 5;
            // 5, 3으로 배달할 수 없는 경우 -1 리턴
        }

    }

}
