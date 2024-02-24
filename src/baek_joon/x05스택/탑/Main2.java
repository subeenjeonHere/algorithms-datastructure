package baek_joon.x05스택.탑;

import java.io.*;
import java.util.Comparator;
import java.util.Optional;
import java.util.Stack;

public class Main2 {
    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        //스택에 push
        String[] tokens = br.readLine().split(" ");
        for (String token : tokens) {
            if (!token.trim().isEmpty()) {
                stack.push(Integer.parseInt(token.trim()));
            }
        }

        while (!stack.isEmpty()) {
            int peek = stack.peek();

            //top을 기준으로 순회하는 for문
            for (int j = stack.size() - 1; j >= 0; j--) {
                if (peek < stack.get(j)) {
                    stack.pop();
//                    sb.append(stack.indexOf(stack.get(j)) + 1).append(" ");
                    sb.append(j + 1).append(" ");
                    break;
                }
            }
            if (peek == stack.peek()) {
                stack.pop();
                sb.append("0").append(" ");
            }
        }
        System.out.println(sb.reverse().toString().trim());
    }
}
