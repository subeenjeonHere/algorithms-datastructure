package baek_joon.others.소수팰린드롬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        isPalind(N);
        isPrime(N);
    }

    //소수 판별
    public static boolean isPrime(int x) {
        // root 전까지 2로 안 나눠지면 이후 대칭이므로 비교X
        int ck = (int) Math.sqrt(x);
        for (int i = 0; i < ck; i++) {
            if (x % 2 != 0)
                return false;
        }
        return true;
    }

    public static boolean isPalind(int x) {
        //Palind 판별
        // String으로 바꿔서 char
        String num = Integer.toString(x);

        int st = 0;
        int end = num.length() - 1;

        while (st <= end) {
            if (num.charAt(st) != num.charAt(end)) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }

}
