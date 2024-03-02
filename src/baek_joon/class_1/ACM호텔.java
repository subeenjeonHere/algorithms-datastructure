package baek_joon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACM호텔 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine(), " ");


            int h = Integer.parseInt(stk.nextToken());
            int w = Integer.parseInt(stk.nextToken());
            int n = Integer.parseInt(stk.nextToken());

            int row = n % h;
            int col = (n / h) + 1;
            System.out.println("층 / 사람 몫 : " + h / n);
            System.out.println();
            if (col <= 9) {
                System.out.println(row + "0" + col);
            } else {
                System.out.println(row + "" + col);
            }

        }
    }
}
