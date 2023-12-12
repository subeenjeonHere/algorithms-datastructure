package n1157;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringTokenizer stk = new StringTokenizer(sc.nextLine());
        String line = null;
        String[] arr = new String[line.length()];
        //char Array에 입력받아야 함

        for (int i = 0; i < arr.length; i++) {
        arr[i]  = stk.nextToken();
        }
        System.out.println(Arrays.toString(arr));
    }
}

/**
 * 첫째줄 앒파벳 대소문자로 이뤄진 단어
 * 1. 알파벳 입력받기
 * 출력 > 가장 많이 사용된 알파벳을 대문자로 출력하기. 알파벳 2 개 이상 존재할 경우 ? 출력하기
 */