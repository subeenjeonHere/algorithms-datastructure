package back_joon.n10871;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        ArrayList<Integer> arst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int el3 = sc.nextInt();
            if (el3 < x)
                arst.add(el3);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arst.size(); i++) {
            sb.append(arst.get(i));
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}

/**
 * n보다 작은 수
 * 정수 n개로 이뤄진 수열 A와, 정수 X가 주어진다.
 * A에서 X 보다 작은 수를 모두 출력하는 프로그램을 작성.
 * 1) N , X 주어진다.
 * 2) A를 이루는 정수 N개가 주어진다.
 */