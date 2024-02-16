package back_joon.x03배열.알파벳개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.XMLFormatter;

public class Main {
    public static void main(String[] args) throws IOException {

        char[] arr = new char[26];
        int[] counting = new int[26];

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String S = sc.next();


        // a-z 저장할 배열
        int a = 97;
        int idx = 0;
        while (a <= 122) {
            for (int i = 0; i < S.charAt(i); i++) {
                if ((char) a == S.charAt(i)) {
                    counting[idx]++;
                    idx++;
                }
            }
            a++;
        }

        int start = 0;
        while (start < counting.length) {
            sb.append(counting[start]).append(" ");
            start++;
        }
        System.out.println(sb);


    }
}

