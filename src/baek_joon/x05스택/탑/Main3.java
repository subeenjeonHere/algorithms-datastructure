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
                stack.push(Integer.parseInt(token.trim()));
            }
        }
        /**
         *
         */


        System.out.println(stack);


    }
}
