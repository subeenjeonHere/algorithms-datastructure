package prog.lv2.가장큰수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;


public class Main2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int[] arr = new int[n];

        String[] sArr = new String[arr.length];
        String[] result = new String[sArr.length];

        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = String.valueOf(arr[i]);
            Integer.valueOf(sArr[i]).compareTo(Integer.valueOf(i + 1));
        }
    }
}
