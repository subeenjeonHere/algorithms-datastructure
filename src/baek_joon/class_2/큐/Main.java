package baek_joon.class_2.큐;

import javax.management.BadStringOperationException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] arr = new String[2];
            StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
            int st = 0;
            while (stk.hasMoreTokens()) {
                arr[st] = stk.nextToken();
                st++;
            }
            if (arr[0].equals("push")) {
                int ele = Integer.parseInt(arr[1]);
                q.offer(ele);
            } else if (arr[0].equals("front")) {
                if (q.isEmpty()) {
//                    sb.append("-1").append("\n");
                    System.out.println("-1");
                } else {
                    int peeked = q.peek();
//                    sb.append(peeked).append("\n");
                    System.out.println(peeked);
                }
                //큐는 맨 뒤 원소 반납하는 메소드 없음
            } else if (arr[0].equals("back")) {
                if (q.isEmpty()) {
//                    sb.append("-1").append("\n");
                    System.out.println("-1");
                } else {
                    back(q);
                }
            } else if (arr[0].equals("empty")) {
                if (q.isEmpty()) {
//                    sb.append("1").append("\n");
                    System.out.println("1");
                } else {
//                    sb.append("0").append("\n");
                    System.out.println("0");
                }
            } else if (arr[0].equals("pop")) {
                if (!q.isEmpty()) {
                    int peeked = q.peek();
                    System.out.println(peeked);
//                    sb.append(peeked).append("\n");
                    q.poll();
                } else {
//                    sb.append("-1").append("\n");
                    System.out.println("-1");
                }
            } else if (arr[0].equals("size")) {
                int size = q.size();
//                sb.append(size).append("\n");
                System.out.println(size);
            }
        }
    }

    //맨 뒤 원소 반환
    private static void back(Queue<Integer> q) {
        StringBuilder sb = new StringBuilder();
        int len = q.size();
        int last = 0;
        for (int i = 1; i <= len; i++) {
            last = q.poll();
            q.offer(last);
            //i가 2일 때 마지막 원소가 최상단에 옴
            //q 사이즈는 2
        }
        System.out.println(last);
    }
}
