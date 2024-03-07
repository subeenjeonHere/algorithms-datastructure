package baek_joon.class_2.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            arr[i] = s;
        }
        //sort by length
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                String temp;
                String string1 = arr[i];
                String string2 = arr[j];
                int stringLen1 = string1.length();
                int stringLen2 = string2.length();

                //문자열 길이 버블 정렬
                String tempString;
                if (stringLen1 > stringLen2) {
                    tempString = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempString;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i - 1].equals(arr[i])) {
                sb.append(arr[i]).append("\n");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
