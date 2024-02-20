package prog.lv0.순서쌍;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 100;

        int tw = 20;
        // i를 100으로 나눴을 때 나눠 떨어지면 약수
        for (int i = 1; i <= tw; i++) {
            if (tw % i == 0) {
                System.out.println("약수: " + i);
            }
        }
    }
}
