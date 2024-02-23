package baek_joon.x03배열.방배정;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());

        // 배열 생성
        int[][] arr = new int[2][7];

        //Input 입력하고, 2차원 배열 s/y 개수 Counting
        int start = 1;

        while (start <= n) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(input.nextToken());
            int y = Integer.parseInt(input.nextToken());
            arr[s][y]++;
            start++;
        }
        //방 개수 Count
        int room = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("I:" + i);
            for (int j = 1; j < arr[i].length; j++) {
                System.out.println("J:" + j);
                if (arr[i][j] % k == 0) {
                    room += arr[i][j] / k;
                } else if (arr[i][j] % k == 1) {
                    room += (arr[i][j] / k) + 1;
                }
            }
        }


//        //출력
        bw.write(room);
//        //남은 값 출력, 버퍼 초기화
//        bw.flush();
        //입력버퍼 close
        br.close();
        //출력버퍼 close
        bw.close();
    }
}


