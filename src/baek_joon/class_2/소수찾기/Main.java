package baek_joon.class_2.소수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int st = 0;
        int count = 0;
        while (stk.hasMoreTokens()) {
            arr[st] = Integer.parseInt(stk.nextToken());
            System.out.println("Arr:" + arr[st]);
            if (isPrime(arr[st]) == 1) {
                count++;
            }
            st++;
        }
        System.out.println(count);
    }

    private static int isPrime(int i) {
        //소수는 1과 자기 자신만을 약수로 갖음
        //2는 소수가 아님
        //소수를 어떻게 판정할 것?
        // 2 3 5 7 9 11 13 17
        //2로 나눠떨어지지 않으며, 1과 자기 자신만 약수로 갖음

        //1은 소수가 아님
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0){
                return 0;
            }
        }
        return 1;
    }
}
