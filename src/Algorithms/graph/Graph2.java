package Algorithms.graph;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Subject 인접 리스트 그래프
 */
class Graphs {

    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    //Vertex 정점
    int V;

    Graphs(int nodes) {
        V = nodes;
        graph = new ArrayList<ArrayList<Integer>>();
        // Node를 나타내는 ArrayList
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
    }

    void putEdge(int v, int n) {

        //정점 연결
        graph.get(v).add(n);
        graph.get(n).add(v);
    }

    void pringGraph() {
        for (int i = 0; i < V; i++) {
            System.out.printf("Node : ");
            for (int x = 0; i < graph.get(i).size(); i++) {
                System.out.printf(graph.get(i) + " -> " + graph.get(x));
            }
        }
    }
}


public class Graph2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Graphs graphs = new Graphs(n);
        int i = 1;
        int i2 = 1;
        graphs.putEdge(i++, i2++);


    }
}
