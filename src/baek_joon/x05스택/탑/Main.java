package baek_joon.x05스택.탑;

import java.util.SortedMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int[] arr = {6, 9, 5, 7, 4};

        //스택에 push
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println("스택: " + stack);

        //스택 길이 만큼 순회
        for (int j = 0; j <= stack.size(); j++) {

            //Top 원소 peek
            int top = stack.peek();
            System.out.println("Now top: " + top);

            //Top 원소 위치
            int topIdx = stack.indexOf(top);
            int start = topIdx;
            System.out.println("Now Top Idx: " + topIdx);

            while (start >= 0) {
                System.out.println("[Start]: " + start);
                if (top < stack.get(start)) {
                    int light = stack.get(start);
                    int lightIdx = stack.indexOf(light) + 1;
                    //발사 가능한 탑 idx
                    System.out.println("[발사탑] :" + stack.get(start) + "//발사탑 위치: " + lightIdx);

                    //pop
                    stack.pop();
                    sb.append(lightIdx).append(" ");
                    break;
                }
                if (top > stack.get(start)) {
                    sb.append("0").append(" ");
                }
                start--;
            }


        }
        System.out.println(sb.reverse());
    }
}
