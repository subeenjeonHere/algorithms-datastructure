package baek_joon.class_3.잃어버린괄호;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * @Point 잃어버린 괄호 스택으로 풀기
 * <p>
 * + 아스키 43
 * - 아스키 45
 */
public class Main3_Stack {
    static Stack<Integer> stk;
    static String[] nums;
    static String[] strings;
    static int[] strToInt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //식 입력 받기
        String s = br.readLine();

        //String 참조 변수 배열
        nums = s.split("[-]");

        //+ 포함하는 원소 합계 구하기
        strToInt = new int[nums.length];
        int a = 0;
        String str = "";
        for (int i = 0; i < nums.length; i++) {

            str = nums[i];

            if (str.contains("+")) {
                strings = str.split("[+]");
                for (int j = 0; j < strings.length; j++) {
                    a += Integer.parseInt(strings[j]);
                }
                strToInt[i] = a;
                a = 0;
            } else {
                strToInt[i] = Integer.parseInt(nums[i]);
            }
        }

        System.out.print(stack());
    }

    private static int stack() {
        stk = new Stack<Integer>();

        int result = strToInt[0];
        //첫 번째 원소 저장
        stk.push(strToInt[0]);

        int start = 1;
        while (start < strToInt.length) {
            stk.push(strToInt[start]);
            start++;
        }
        while (stk.size() > 1) {
            result -= stk.pop();
        }
        return result;

    }
}
