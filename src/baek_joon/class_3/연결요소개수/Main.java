package baek_joon.class_3.연결요소개수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Point - 연결요소의 개수
 * 인접리스트, DFS 사용
 */
public class Main {
    static ArrayList<ArrayList<Integer>> graph;
    static boolean visit[];
    static int n, m;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //정점 N, 간선 M 입력 받기
        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        //인접 리스트 할당
        graph = new ArrayList<>();
        //방문 배열 생성
        visit = new boolean[n + 1];
        //노드 개수만큼 행 생성
        for (int i = 0; i < n; i++) {
            graph.add(i, new ArrayList<>());
        }
        //엣지 연결, 간선 m 만큼 반복
        for (int i = 0; i < m; i++) {
            String[] ab = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            putEdge(a, b);
        }

        print();
        //dfs 호출

    }


    //dfs
    //스택 할당

    //간선 연결
    public static void putEdge(int a, int b) {
        graph.get(a).add(b);
        graph.get(b).add(a);
    }


    private static void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}