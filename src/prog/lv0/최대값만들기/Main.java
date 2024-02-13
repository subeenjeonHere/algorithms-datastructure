package prog.lv0.최대값만들기;

import javax.xml.crypto.dsig.CanonicalizationMethod;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int answer = 0;
        //중복된 원소 고려
        //max !=라고 주면 중복된 원소가 있을 때 체크하지 못 함
        //중복된 경우와 동시에 중복되지 않으며 첫 번째 max의 다음 max를 고려
        int nmax = arr[0];
        int smax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    answer = Math.max(answer, arr[i] * arr[j]);
                }
            }
        }
        System.out.println(answer);
    }
}
