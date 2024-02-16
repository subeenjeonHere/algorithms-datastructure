package back_joon.x03배열.알파벳개수;

import java.util.Scanner;
import java.util.logging.XMLFormatter;

public class Main {
    public static void main(String[] args) {
        char[] arr = new char[26];
        StringBuilder sb = new StringBuilder();

        // a-z 저장할 배열
        int a = 97;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) a;
            a++;
        }
        // String 입력
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        // arr 길이까지 반복, Str.charAt(i)와 arr[i]가 같은 경우 a-z의 개수를 카운팅 할 temp 배열을 1씩 카운팅
        int[] counting = new int[26];
        for (int i = 0; i < S.length(); i++) {
            for (int k = 0; k < arr.length; k++) {
                if (S.charAt(i) == arr[k]) {
                    counting[k]++;
                }
            }
        }

        int start = 0;
        while (start < arr.length) {
            sb.append(counting[start]).append(" ");
            start++;
        }
        System.out.println(sb);
    }
}

