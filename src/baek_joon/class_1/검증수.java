package baek_joon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 검증수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 5;

        String[] nums = new String[5];
        for (int i = 1; i <= 1; i++) {
            nums = br.readLine().split(" ");
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.pow(Integer.parseInt(nums[i]), 2);
        }
        System.out.println(sum % 10);

    }
}
