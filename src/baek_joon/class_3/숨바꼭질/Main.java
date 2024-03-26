package baek_joon.class_3.숨바꼭질;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TreeNode {
    int val;
    TreeNode[] child;

    TreeNode(int val) {
        this.val = val;
        child = new TreeNode[3]; //최대 3개 자식 노드
    }
}

public class Main {
    static int n, k;
    TreeNode root;

    Main(int val) { // 루트 노드 자식 추가
        root = new TreeNode(val);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        //수빈 위치
        //루트 노드
        n = Integer.parseInt(nk[0]);
        //동생 위치
        //목표값
        k = Integer.parseInt(nk[1]);

        //루트노드로 n 삽입
        Main tree = new Main(n);
        //루트노드 자식 생성
        //자식 노드 만들고, 자식 노드에 또 자식노드 만듦 1 -> 3 -> 6 -> 9 형태 증가
        //노드 값이 K이면 생성 종료해야 함
        createChild(tree.root, 3);
        print(tree.root);

    }

    private static int createChild(TreeNode node, int levels) {
        if (levels == 0 || node == null) {
            return 0;
        }

        for (int i = 0; i < 3; i++) {
            int nowVal = node.val;
            //K노드 나오면 자식노드 더 생성할 필요 없음
            if (nowVal * 2 == k || nowVal - 1 == k || nowVal + 1 == k) {
                return 1;
            }
            if (i == 0) {
                //순간이동 2*x
                node.child[i] = new TreeNode(node.val * 2);
            } else if (i == 1) {
                // x-1
                node.child[i] = new TreeNode(node.val - 1);
            } else {
                //x+1
                node.child[i] = new TreeNode(node.val + 1);
            }
        }
        return 0;
    }

    //자식노드 출력해보기
    private static void print(TreeNode node) {
        if (node == null) {
            return;
        }
        for (TreeNode nodes : node.child) {
            System.out.println(nodes.val + " ");
        }
    }
}
