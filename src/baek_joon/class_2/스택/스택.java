package baek_joon.class_2.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack<>();
        ArrayList<String> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String[] s = new String[2];
            StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
            int start = 0;
            while (stk.hasMoreTokens()) {
                s[start] = stk.nextToken();
                start++;
            }
            if (s[0].equals("push")) {
                stack.push(Integer.parseInt(s[1]));

            } else if (s[0].equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else {

                    String peeked = String.valueOf(stack.peek());
                    System.out.println(peeked);
                }

            } else if (s[0].equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else {

                    System.out.println(stack.pop());
                }

            } else if (s[0].equals("size")) {
                System.out.println(stack.size());
            } else if (s[0].equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }
        }
    }
}

