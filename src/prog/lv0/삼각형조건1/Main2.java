package prog.lv0.삼각형조건1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        int[] arr = {199, 72, 222};

        Arrays.sort(arr);
        String answer = (arr[2] > arr[0] + arr[1]) ? "2" : "1";
        System.out.println(answer);
    }
}
