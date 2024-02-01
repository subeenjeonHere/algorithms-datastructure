package back_joon.n1260;

import java.util.*;

/**
 * chap. 1260 sec. DFS, BFS
 */
public class Main2 {
    static ArrayList<Integer> arr[];
    static boolean visited[];

    private static void BFS(int node) {
        Queue<Integer> qu = new LinkedList<Integer>();
        qu.add(node);
        visited[node] = true;

        while (!qu.isEmpty()) {
            int nowNode = qu.poll();

            System.out.print(nowNode + " ");

            for (int ele : arr[nowNode]) {
                if (!visited[ele]) {
                    visited[ele] = true;
                    qu.add(ele);
                }
            }
        }
    }

    //recursively
    private static void DFS(int node) {
        System.out.print(node + " ");
        visited[node] = true;


        // ✳ 방문하지 않은 node 탐색 -> 방문하지 않은 node들 재귀호출
        for (int ele : arr[node]) {
            if (!visited[ele]) {
                DFS(ele);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int start = sc.nextInt();
        arr = new ArrayList[N + 1];

        // 각 자리마다 객체를 ArrayList로 할당 ∴ 인접리스트 완성
        // ✳ 배열 루프 범위설정 실수
        for (int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            int nd1 = sc.nextInt();
            int nd2 = sc.nextInt();
            // ✳ 양방향 edge
            arr[nd1].add(nd2);
            arr[nd2].add(nd1);
        }

        // edge ASC 정렬
        for (int i = 1; i < N; i++) {
            Collections.sort(arr[i]);
        }

        visited = new boolean[N + 1];
        DFS(start);
        System.out.println();
        visited = new boolean[N + 1];
        BFS(start);
        System.out.println();
    }
}

