package baek_joon.x05스택.탑;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {

        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        //스택에 push
        String[] tokens = br.readLine().split(" ");
        for (String token : tokens) {
            if (!token.trim().isEmpty()) {
                stack.push(Integer.parseInt(token.trim()));
            }
        }


        while (!stack.isEmpty()) {
            //스택 비어 있으면 종료
            if (stack.isEmpty()) {
                break;
            }

            //스택 peek
//            System.out.println("Next Peek");
            int peek = stack.peek();
//            System.out.println("[지금 Top]: " + peek);

//            System.out.println("사이즈: " + stack.size());
//            System.out.println();

            //top을 기준으로 순회하는 for문
            for (int j = stack.size() - 1; j >= 0; j--) {
//                System.out.println("Stack 길이: " + stack.size() + " // 탐색위치: " + j + "// 탐색원소:" + stack.get(j));

                if (peek < stack.get(j)) {
//                    System.out.println("Bigger than peeked!");

                    int idx = stack.indexOf(stack.get(j)) + 1;
                    stack.pop();

//                    System.out.println("최대값을 찾아 Pop한 후의 Top: " + stack.peek());
//                    System.out.println();

                    sb.append(idx).append(" ");

                    //최대값 찾으면 I기준으로 탐색하는 For문 탈출
                    break;
                }
            }
            if (peek == stack.peek()) {
//                System.out.println("최대값을 못 찾음   " + stack.peek());
                stack.pop();
                sb.append("0").append(" ");
            }
        }
        System.out.println(sb.reverse().toString().trim());
        br.close();
    }
}
