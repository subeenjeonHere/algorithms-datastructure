package back_joon.맥주마시면서걸어가기;
/**
 * @Solution: BFS
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Node[] nodes;
    static boolean[] visited;
    static boolean happy;

    static class Node {
        int x, y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Test case count
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            nodes = new Node[n + 2];
            visited = new boolean[n + 2];
            happy = false;

            for (int i = 0; i < n + 2; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                nodes[i] = new Node(x, y);
            }
            dfs(nodes[0], nodes[n + 1]);
        }

    }

    private static void dfs(Node now, Node end) {
        if (now == end) {
            happy = true;
            return;
        }

        for (int i = 0; i < nodes.length; i++) {
            if (!visited[i] && Math.abs(now.x - nodes[i].x) + Math.abs(now.y - nodes[i].y) <= 1000) {
                visited[i] = true;
                dfs(nodes[i], end);
                if (happy) return;
            }
        }
    }
}
