package prog.lv1.자릿수더하기;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        int n = 987;
        String answer = String.valueOf(n);
        String[] arr = new String[answer.length()];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(answer.charAt(i));
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);

    }
}
