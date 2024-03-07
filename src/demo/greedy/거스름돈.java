package demo.greedy;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 거스름돈 {
    public static void main(String[] args) {
        // 거스름돈 동전의 최소 개수

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] coin = {5, 2};
        System.out.println(Arrays.toString(coin));

        //동전 개수
        int count = 0;
        for (int i = 0; i < coin.length; i++) {

            // 13원을 5 , 2 로 최소의 개수로 거슬러 줘야 함
            count += n / coin[i];

            System.out.println("몫: " + n / coin[i]);
            System.out.println(count);

        }


    }
}
