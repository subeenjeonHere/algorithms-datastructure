package demo.graph;

public class Main {
    public static void main(String[] args) {
        int n = 5; //그래프 정점 개수
        int[][] graph = new int[n+1][n+1]; //idx 1부터 맞추기 위함

        putEdge(graph, 1, 2);
        putEdge(graph, 1, 3);
        putEdge(graph, 1, 4);
        putEdge(graph, 2, 3);
        putEdge(graph, 2, 5);
        putEdge(graph, 3, 4);
        putEdge(graph, 4, 5);

        printf(graph);
    }

    private static void printf(int[][] graph) {
        for (int i = 1; i < graph.length; i++) {
            for (int j = 1; j < graph.length; j++) {
                System.out.printf(graph[i][j] + " ");
                System.out.println();
            }
        }
    }

    private static void putEdge(int[][] graph, int x, int y) {

        //정점을 잇는 노드를 연결
        graph[x][y] = 1;
        graph[y][x] = 1;

    }
}
