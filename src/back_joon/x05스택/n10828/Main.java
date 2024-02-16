package back_joon.x05스택.n10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stk = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            // 토큰에 input 저장
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int count = st.countTokens();
            String[] arr = new String[count];

            // Converting each token to array
            for (int x = 0; x < arr.length; x++) {
                arr[x] = st.nextToken();
            }

            // 연산 start
            if (arr[0].equals("push")) {
                Integer ele = Integer.parseInt(arr[1]);
                stk.push(ele);

            } else if (arr[0].equals("pop")) {
                if (stk.isEmpty()) {
                    System.out.println("-1");
                } else {
                    int popped = stk.pop();
                    System.out.println(popped);
                }

            } else if (arr[0].equals("top")) {
                if (stk.isEmpty()) {
                    System.out.println("-1");
                } else {
                    int peeked = stk.peek();
                    System.out.println(peeked);


                }


            } else if (arr[0].equals("size")) {
                int size = stk.size();
                System.out.println(size);

            } else if (arr[0].equals("empty")) {
                if (stk.isEmpty()) {
                    System.out.println("1");
                    System.out.flush();
                } else {
                    System.out.println("0");
                    System.out.flush();

                }
            }
        }
    }
}
/**
 * Top, Size, empty 한 줄에 출력됨
 */