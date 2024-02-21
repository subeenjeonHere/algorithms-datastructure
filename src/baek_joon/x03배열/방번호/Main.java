package baek_joon.x03배열.방번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char val = (int) 48;
        int n = Integer.parseInt(String.valueOf(val));

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
            n++;
        }
        int num = Integer.parseInt(br.readLine());
        char[] chars = String.valueOf(num).toCharArray();

        // chars 배열에 동일한 값 있는지 counting
        int result = 1;
        for (int i = 0; i <= chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                System.out.println("I" + i + " :" + chars[i]);
                System.out.println("J" + j + " :" + chars[j]);
                if (chars[i] == chars[j]) {
                    result++;
                }
            }
        }

        System.out.println(result);

    }
}