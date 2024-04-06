package baek_joon.class_3.숨바꼭질;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/***
 * @Point
 *
 * - BFS, 연결 리스트
 * - K 노드 찾을 때 까지 BFS 수행하고 레벨 출력
 * @Review
 * 노드 몇 개 생성 될지 몰라서 방문 배열 ArrayList로 생성
 * 숫자 커질 수록 방문 여부 체크할 때마다 전체 탐색 해야 함 > 당연히 시간 초과
 */
public class Main {

    //방문 배열
    static boolean[] visit;
    //n,k
    static int n, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //n,k 입력받기
        String[] nk = br.readLine().split(" ");
        n = Integer.parseInt(nk[0]);
        k = Integer.parseInt(nk[1]);

        visit = new boolean[200002];
        //Call bfs
        bfs(n);
    }

    private static void bfs(int Node) {
        int[] operation = {2, 1, -1};

        Queue<Dis> q = new LinkedList<>();

        q.add(new Dis(Node, 0));

        visit[Node] = true;

        //3 operation
        //2*x, x+1, x-1
        //연산결과 방문 체크, 방문 했다면 삽입 안함
        while (!q.isEmpty()) {

            Dis x = q.poll();

            //노드값,거리, 방문 여부
            int nowNode = x.getNode();
            int nowDis = x.getDis();

            //k 찾으면 종료 하고 Distance 리턴
            if (nowNode == k) {
                System.out.print(nowDis);
                return;
            }

            //방문 했다면 삽입 안함
            for (int i = 0; i < operation.length; i++) {
                int newNode = 0;

                //곱, +- 연산 분리
                if (i == 0) {
                    newNode = operation[0] * nowNode;
                } else {
                    newNode = operation[i] + nowNode;
                }

                if (newNode < 0 || newNode >= 200002) {
                    continue;
                }
                if (!visit[newNode]) {
                    visit[newNode] = true;
                    q.add(new Dis(newNode, nowDis + 1));
                }

            }
        }
    }
    public static class Dis {
        private final int node;
        private final int dis;

        public Dis(int node, int dis) {
            this.node = node;
            this.dis = dis;
        }

        public int getNode() {
            return node;
        }

        public int getDis() {
            return dis;
        }
    }
}
