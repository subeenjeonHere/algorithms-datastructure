package programmers.lv1.평균구하기;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        double avg = list.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println(avg);
    }
}
