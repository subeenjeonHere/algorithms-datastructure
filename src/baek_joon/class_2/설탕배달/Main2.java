package baek_joon.class_2.설탕배달;

import java.util.Scanner;

/**
 * 5kg를 우선 사용한다. 5kg를 하나씩 뺴보면서 3kg를 사용할 수 있는지 확인
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int temp = 0;
        int cnt3 = 0;
        int cnt5 = 0;

        // 5kg를 하나씩 뺀다
        do {
            n = n - 5;
            System.out.println("N1: " + n);
            //n이 3으로 나눠 떨어지면 n/3 cal
            // @9일 때, 5를 빼버리니 5kg를 사용하지 않고 3kg만 사용해야 하는 경우 체크하지 못 함
            if (n % 3 == 0) {

                cnt3 = n / 318;
                System.out.println("N2: " + n);
                //8-5 3이 되어 5kg를 사용했는데, 3kg를 사용해야 할 때 cnt5를 거치지 않으므로 1 추가
                cnt5 += 1;
                break;
            }
            //n이 음수가 될 경우
            if (n < 0) {
                System.out.println("N3: " + n);
                n = n + 5;
                break;
            }
            cnt5++;
        } while (n > 0);
        System.out.println("결과: " + cnt3 + "//" + cnt5);
    }
}
