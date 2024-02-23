package baek_joon.x05스택.탑;

import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int[] arr = {6, 9, 5, 7, 4};

        //스택에 push
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println(stack);

        while (!stack.isEmpty()) {

            //top 인덱스
            int topIdx = stack.indexOf(stack.peek());

            //만약 idx가 top보다 크다면
            if (stack.get(topIdx) > stack.peek()) {

                System.out.println("Bigger than peek");
                stack.pop();

            } else {
                System.out.println("Not Found");
            }

            //비교할 포인터
            //스택의 원소들 인스 턴스

        }


    }
}
