package baek_joon.x05스택.탑;

import javax.imageio.IIOException;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Main3 {
    public static void main(String[] args) throws IOException {

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // n 입력받고 스택에 push
        String[] tokens = br.readLine().split(" ");

        for (String token : tokens) {
            if (!token.trim().isEmpty()) {
                int ele = Integer.parseInt(token.trim());
                stack.push(ele);
            }

            int peek = stack.peek();
            int peekIdx = stack.size();
            System.out.println("// Peek:" + peek + "//Peek Idx" + peekIdx);

            int pt = peekIdx - 1;
            while (pt >= 0) {
                int temp = stack.elementAt(pt);
                if (temp > peek) {
                    System.out.println(stack.indexOf(temp));
                    System.out.println(temp + " 큰 값 발견: " + stack.indexOf(pt) + "/// " + stack.peek());

                    sb.append(pt + 1).append(" ");
                    break;
                }
                sb.append("0").append(" ");

                pt--;
            }

        }

        System.out.println(sb.toString());

    }
}
