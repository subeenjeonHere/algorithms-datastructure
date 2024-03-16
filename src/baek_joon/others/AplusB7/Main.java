package baek_joon.others.AplusB7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //테케 T
        //각 줄 a, b 테케 만큼
        // 각 테케마다 Case 출력 후 A+B 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        String op = "Case #";

        int tc = Integer.parseInt(br.readLine());
        for (int i = 1; i <= tc; i++) {
            String[] ab = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            sb.append(op).append(i).append(":").append(" ").append(a + b).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
