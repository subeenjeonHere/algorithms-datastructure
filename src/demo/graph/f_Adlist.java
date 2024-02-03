package demo.graph;

import java.util.ArrayList;

public class f_Adlist {

    public static void putEdge(ArrayList<ArrayList<Integer>> graphTo, int x, int y) {
        graphTo.get(x).add(y);
        graphTo.get(y).add(x);
    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> graphTo = new ArrayList<>();

        for (int i = 0; i <= n; i++)
            graphTo.add(new ArrayList<>()); // 각 노드별 리스트 생성
        putEdge(graphTo, 1, 2);
        putEdge(graphTo, 1, 3);
        putEdge(graphTo, 1, 4);
        putEdge(graphTo, 2, 3);
        putEdge(graphTo, 2, 5);
        putEdge(graphTo, 3, 4);
        putEdge(graphTo, 4, 5);

        printf(graphTo);
    }

    private static void printf(ArrayList<ArrayList<Integer>> graphTo) {

        for (int i = 1; i < graphTo.size(); i++) {
            ArrayList<Integer> node = graphTo.get(i);
            System.out.printf("node" + i); // node를 출력하고

            for (int j = 0; j < node.size(); j++) { // node와 연결된 node들을 출력
                System.out.printf(String.valueOf(node.get(j)));
                System.out.println();
            }
        }
    }
}
