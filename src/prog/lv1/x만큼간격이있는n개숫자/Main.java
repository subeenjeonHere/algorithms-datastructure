package prog.lv1.x만큼간격이있는n개숫자;

import java.util.Arrays;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        int x = -4;
        int n = 2;
        long[] arr = new long[n];

        System.out.println(LongStream.iterate(x, i -> i+x).limit(n).toArray());

    }
}
