package baek_joon.class_2.설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * N kg 배달
 * 3, 5 kg 봉지
 * 최대한 적은 봉지로 배달
 * 5kg를 최대한 많이 사용
 * 18kg 있다면, 5kg 3개 3kg 1개
 * 1. 5의 배수라면 5kg만 사용
 * 2. 5의 배수가 아니라면, 5로 나눌 수 있을 만큼 나눈 후 3 사용
 * 3. 정확히 N으로 나눠 떨어지지 않는다면, -1을 리턴
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int k1 = 5;
        int k2 = 3;

        //5의 배수일 때 5Kg만 사용
        if (n % k1 == 0) {
            int result = n / k1;
            System.out.println(result);
        }
        //3의 배수일 때 3kg만 사용
        if (n % k2 == 0) {
            int result = n / k2;
            System.out.println(result);
        }

        int count = 0;
        //봉지
        int[] bag = {5, 3};
        // 5kg 봉지로 나누고, 나머지가 5의 배수가 아니라면 3으로 나눠준다.
        for (int i = 0; i < bag.length; i++) {

            int pointer = 0;
            //5kg로 나눌 수 없을 때 까지 = 나머지가 5보다 작아질 때 까지
            while (n % bag[i] <= 5) {
                count += n / bag[i];
                System.out.println("몫: " + n / bag[i]);

                System.out.println("Count:  " + count);
                if (n % bag[i] <= 3) {
                    count += n / bag[1];
                    break;
                }
            }


        }


    }
}
