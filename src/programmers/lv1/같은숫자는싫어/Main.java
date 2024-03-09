package programmers.lv1.같은숫자는싫어;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    static int[] result;

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        StringBuilder sb = new StringBuilder();
        result = new int[arr.length];

        Stack<Integer> stk = new Stack<>();
        // 스택에 값 삽입하고
        if (stk.isEmpty()) {
            stk.push(arr[0]);
        }

        int f1 = stk.peek();
        System.out.println("Size : " + stk.size());

        // 스택이 비어있지 않고, stk의 Top을 peek 했을 때 arr[i]과 동일하다면 (중복) -> push 안함
        // 스택이 비어있지 않고, stk의 Top을 Peek 했을 때 arr[i]과 동일하지 않다면 -> push
        for (int i = 1; i < arr.length; i++) {
            if (!stk.isEmpty() && stk.peek().equals(arr[i])) {
                System.out.println("Not push: " + arr[i]);
                continue;
            } else if (!stk.isEmpty() && !stk.peek().equals(arr[i])) {
                System.out.println("Push: " + arr[i]);
                stk.push(arr[i]);
            }
        }

        for (int ele : stk) {
            sb.append(ele).append(" ");
        }
        System.out.println(sb);

        // 스택은  한 쪽 에서만 Push,Pop 하는 LIFO 형식이므로 역순으로 ans에 저장될것임
        // 첫 번째로 pop되는 게 가장 나중에 들어온 원소임. 첫 번째 pop을 ans의 맨 마지막에 저장해줘야 한다.
        // ans 길이는 stk.size:4, 3,2,1,0 으로 감소하며 ans[0++]에 저장되어야 한다.
        int[] ans = new int[stk.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stk.pop();
        }

        System.out.println("Answer: " + Arrays.toString(ans));
    }
}
