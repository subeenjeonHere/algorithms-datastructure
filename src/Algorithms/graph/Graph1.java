package Algorithms.graph;

import java.util.ArrayList;

/**
 * @Subject graph
 */

class Graph {
    ArrayList<ArrayList<Integer>> graph;
    int V;

    Graph(int nodes) {
        V = nodes;
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
    }

    void addEdge(int v, int u) {
        graph.get(v).add(u);
        graph.get(u).add(v);
    }

    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Node i :");
            for (int x : graph.get(i)) System.out.printf(" -> " + x);
            System.out.println();
        }
    }
}
public class Graph1 {
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(4, 5);
        g.addEdge(2, 5);
        g.addEdge(3, 2);
        g.printGraph();
    }
}
