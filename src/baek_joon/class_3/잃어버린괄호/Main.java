package baek_joon.class_3.잃어버린괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Point :: - 연산자 직전까지 더하고, - 연산자 직전까지 더하고 빼기를 반복
 * :: - 연산자 활용 주의
 */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //식 입력
        String s = br.readLine();

        //연산자 참조 변수
        String minus = "-";
        String plus = "+";

        System.out.println(s);


    }
}

//애초에 입력 받을 때 연산자 기준으로 나눠서 입력 받을지