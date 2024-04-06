package baek_joon.others.곱셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] a1 = new int[3];
        int[] a2 = new int[3];
        //1, 2번 째 숫자 String 배열에 각 문자 저장
        for (int i = 0; i < 2; i++) {
            String num = br.readLine();
            String[] str = num.split("");
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    a1[j] = (int) Integer.parseInt(str[j]);

                } else if (i == 1) {
                    a2[j] = (int) Integer.parseInt(str[j]);
                }
            }
        }

        //연산수행
        int[] r6 = new int[6];
        int id = 5;

        for (int j = a1.length - 1; j >= 0; j--) {
            int[] result = new int[4];
            int idx = 3;
            int o1 = a2[j];

            for (int i = a2.length - 1; i >= 0; i--) {
                int o2 = a1[i];
                if (o1 * o2 >= 10) {
                    //o1*o2 % 10을 출력
                    result[idx] += (int) (o1 * o2) % 10;
                    result[idx - 1] += (o1 * o2) / 10;
                    idx--;
                    //i-1 자리에 +1을 해줌
                } else {
                    result[idx] += (o1 * o2);
                    idx--;
                }
                //o1*o2를 그대로 출력
            }
            for (int ele : result) {
                System.out.print(ele);
            }
            System.out.println();

//이거 처리
            int sq = 3;
            while (sq >= 0) {
                r6[id] = result[sq];
                id--;
                sq--;
            }
        }

    }
}
