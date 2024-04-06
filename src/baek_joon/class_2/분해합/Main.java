package baek_joon.class_2.분해합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Main {
    static int n;
    static int m;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n 입력
        n = Integer.parseInt(br.readLine());

        // 합을 계산할 생성자 변수
        // n의 전체 길이 + 전체 길이를 1개씩 분할하여
        int len = String.valueOf(n).length();

        // n 길이만큼 배열 생성
        arr = new int[len];

        String numOne = "";
        for (int i = 0; i < len; i++) {
            numOne += "0";
        }
        int one = Integer.parseInt(numOne);
        int mod = n - one;

        //n 길이만큼 1로 만들고, 여기서 +1 끝자리부터 더해 나감
        int res = n - mod;
        arr[0] = res;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = 1;
        }

        // abc+ a+ b+ c
        // c > b > a 순으로 1씩 더하며 n이 되면 종료
        int result = 0;
        //sum이 n과 같아질 때 까지 더하기 연산 반복 d

        while (result <= n) {
            int[] gc = new int[len];
            String[] strings = String.valueOf(arr[0]).split("");
            for (int i = 0; i < strings.length; i++) {
                gc[i] = Integer.parseInt(strings[i]);
            }
            int gcSum = 0;
            for (int element : gc) {
                gcSum += element;
            }
            result = gcSum + arr[0];

            if (result == n - 1) {
                System.out.print(arr[0]);
                return;
            }
            if (strings[strings.length - 1].equals("9")) {
                arr[0] += 2;
            } else {
                arr[0] += 1;
            }
            result = 0;
        }
    }
}
// 119 1 1 9
// 121 1 2 1
// 122 1 2 2
// 123 1 2 3
// 18: 1,8
//