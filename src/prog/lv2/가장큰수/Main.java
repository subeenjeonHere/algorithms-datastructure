package prog.lv2.가장큰수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;

import static java.lang.CharSequence.compare;


public class Main {

    static String ro, rt;

    public static int compare(String ro, String rt) {
        int nd = Integer.valueOf(ro);
        int nt = Integer.valueOf(rt);
        int res = Math.max(nd, nt);
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] str = new String[n];

        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf(arr[i]);
        }
        System.out.println(str);


        for (int i = 0; i <= str.length; i++) {
            for (int j = 1; j < str.length; j++) {
                String ro = str[i];
                String rt = str[j];
                compare(ro, rt);
            }
        }
    }
}

