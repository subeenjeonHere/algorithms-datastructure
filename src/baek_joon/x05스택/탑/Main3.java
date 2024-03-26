package baek_joon.x05스택.탑;

import javax.imageio.IIOException;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class Main3 {
    static class Tower {
        int idx;
        int height;

        public Tower(int idx, int height) {
            this.idx = idx;
            this.height = height;
        }
    }

    public static void main(String[] args) throws IOException {

        Stack<Integer> stack = new Stack<>();


        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // n 입력 받고 스택에 push
        String[] tokens = br.readLine().split(" ");
        System.out.println(Arrays.toString(tokens));

        // 첫 번째 원소 Push
        for (int i = 0; i < 1; i++) {
            int first = Integer.parseInt(tokens[0].trim());
            stack.push(first);
        }

        //Stack에 Push or Not
        for (int i = 1; i < tokens.length; i++) {
            System.out.println("Token길이: " + tokens.length + " //" + i);

            int peek = stack.peek();
            int peekIdx = stack.indexOf(peek);
            System.out.println("Top: " + peek);

            //다음 토큰
            int next = Integer.parseInt(tokens[i].trim());
            System.out.println("Next: " + next);

            //다음 토큰이 top 보다 크다면, 현쟈 top pop, "0" 입력, next 토큰 push
            //다음 토큰이 작다면, 현재 top idx를 기록하고 push 하지 않음 > 작다면 뒤의 토큰들도 max인 현재 top에 발사할 것이기 때문
            if (next > peek) {

                stack.pop();
                sb.append("0").append(" ");
                stack.push(next);

                System.out.println("결과: : " + sb.toString());
                System.out.println();

            } else if (peek > next) {

                sb.append(peekIdx).append(" ");

                System.out.println("Bigger");
                System.out.println("Top: " + peek + "// Next: " + next);
                sb.append(peekIdx).append(" ");
                System.out.println();

                System.out.println("결과: : " + sb.toString());
                System.out.println();

                stack.push(next);
                System.out.println();

            }
        }


//        for (String token : tokens) {
//            if (!token.trim().isEmpty()) {
//                int ele = Integer.parseInt(token.trim());
//                stack.push(ele);
//            }
//
//            int peek = stack.peek();
//            int peekIdx = stack.size();
//            System.out.println("// Peek:" + peek + "//Peek Idx" + peekIdx);
//
//            int pt = peekIdx - 1;
//            while (pt >= 0) {
//                int temp = stack.elementAt(pt);
//                if (temp > peek) {
//                    System.out.println(stack.indexOf(temp));
//                    System.out.println(temp + " 큰 값 발견: " + stack.indexOf(pt) + "/// " + stack.peek());
//
//                    sb.append(pt + 1).append(" ");
//                    break;
//                }
////                sb.append("0").append(" ");
//
//                pt--;
//            }
//
//        }

        System.out.println(sb.toString());

    }
}
