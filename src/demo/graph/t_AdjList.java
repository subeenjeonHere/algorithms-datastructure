package demo.graph;

import java.util.ArrayList;

/**
 * 인접 리스트 만들기
 */
public class t_AdjList {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 1, 5);
        addEdge(graph, 2, 4);
        addEdge(graph, 3, 4);
        addEdge(graph, 4, 5);
        addEdge(graph, 6, 7);
        addEdge(graph, 7, 8);
        addEdge(graph, 8, 9);
        addEdge(graph, 9, 10);
        addEdge(graph, 10, 11);

        printf(graph);

    }

    private static void printf(ArrayList<ArrayList<Integer>> graph) {
        for (int i = 1; i < graph.size(); i++) {
            ArrayList<Integer> node = graph.get(i);
            System.out.printf("Node" + i);
            for (int j = 0; j < node.size(); j++) {
                System.out.printf(String.valueOf(node.get(j)));
                System.out.println();
            }
        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> graph, int x, int y) {
        graph.get(x).add(y);
        graph.get(y).add(x);
    }
}
