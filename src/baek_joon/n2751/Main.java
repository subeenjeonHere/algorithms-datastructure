package baek_joon.n2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int num : arr){
            sb.append(num).append('\n');
        }
        System.out.println(sb);
    }
}

// N 개의 수 오름차순 정렬하기
// N 1~1,000,000 개의 수 개수가 주어짐
// N 개 줄에는 수가 주어짐
// 첫째줄부터 N 개의 줄에 오름차순으로 정렬한 결과 한 줄 하나씩 출력

// 1. 시간초과
