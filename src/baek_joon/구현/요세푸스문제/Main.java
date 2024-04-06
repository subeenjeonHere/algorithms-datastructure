package baek_joon.구현.요세푸스문제;
//요세푸스 0

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 1-N 원을 이루어 앉음
 * 순서대로k 번째 사람을 제거
 * 1 2 3 4 5 6 7
 * (7,3) -> 3 6 2 7 5 1 4
 * 큐
 */
public class Main {
    static int n, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> q = new LinkedList<>();

        String[] nk = br.readLine().split(" ");
        //사람 수, 삭제 순서
        n = Integer.parseInt(nk[0]);
        k = Integer.parseInt(nk[1]);

        //큐 fifo
        //순서대로 삽입해야함. 3턴씩 나누어 삽입을 해야 큐에서 요셒 순서대로 출력 가능
        //동적할당 가능한 arraylist

        ArrayList<Integer> list = new ArrayList<>();
        //3,6 순서대로 어떻게 넣을건지
        //list에 1 - N까지 저장해두고, 큐에 삽입할 때 i = 3, i


    }
}
