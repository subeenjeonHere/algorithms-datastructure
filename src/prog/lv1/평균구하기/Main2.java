package prog.lv1.평균구하기;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        System.out.println(
                Arrays.stream(arr)
                        .average()
                        .getAsDouble());
    }
}
