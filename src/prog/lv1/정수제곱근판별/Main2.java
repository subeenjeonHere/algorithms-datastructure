package prog.lv1.정수제곱근판별;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) {

        long n = 121;
        // i*i를 곱해서 121이 되는 수라면 121의 약수일 것임
        //소수일 경우, 이 값이 없으므로 -1을 return

        //소수가 아닐 경우에, 해당 값의 약수를 구해 i*i == 121이 되는 값을 찾아 Math.pow
        //혹은 약수 중에서, Math.pow(i,2)가 n일 경우
        for (int i = 1; i <= Math.sqrt(n); i++) {

            System.out.println("값: " + Math.sqrt(n));
            if (n % i == 0) {

                System.out.println("N: " + n);
                System.out.println("I: " + i);
                if (Math.pow(i, 2) == n) {
                    System.out.println((long) Math.pow(i + 1, 2));
                    return;
                }
            }
        }
        System.out.println("-1");


    }
}
