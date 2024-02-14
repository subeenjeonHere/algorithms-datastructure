package prog.lv0.배열자르기;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;
        int idx = 0;
        int[] answer = new int[num2 - num1 + 1];

        for (int i = 0; i < numbers.length; i++) {
            if (i >= num1 && i <= num2) {
                answer[idx] = numbers[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
