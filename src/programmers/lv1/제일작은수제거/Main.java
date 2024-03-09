package programmers.lv1.제일작은수제거;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {4, 3, 2, 1, 34, 0, 23, 43, 55, 4, 42, 5, 6, 3};
        int[] arr = {10};
        Stack<Integer> stack = new Stack<>();

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        if (arr.length == 1) {
            System.out.println("-1");
        }

        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) {
                continue;
            }
            stack.push(arr[i]);
        }
        System.out.println(stack);

    }
}
