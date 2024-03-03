package baek_joon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SimpleTimeZone;
import java.util.StringTokenizer;

public class 알람시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int h = 0;
        int m = 0;

        while (stk.hasMoreTokens()) {
            h = Integer.parseInt(stk.nextToken());
            m = Integer.parseInt(stk.nextToken());

            if (m - 45 < 0) {
                if (h == 0) {
                    h = 23;
                    m = 60 - (45 - m);
                    sb.append(h).append(" ").append(m);
                } else {
                    h = h - 1;
                    m = 60 - (45 - m);
                    sb.append(h).append(" ").append(m);
                }
            } else {
                m = m - 45;
                sb.append(h).append(" ").append(m);
            }
        }
        System.out.println(sb.toString().trim());
    }
}
