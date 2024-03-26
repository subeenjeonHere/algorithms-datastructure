package DataStructure.tree;

import com.sun.source.tree.Tree;

import javax.swing.*;
import java.util.Arrays;

class TreeNode { // 트리 클래스 : 노드
    int val; //정수값
    TreeNode[] child; //최대 3개 자식 노드 저장 배열

    TreeNode(int val) {
        this.val = val;
        child = new TreeNode[3]; //최대 3개의 자식 노드
    }
}

public class ThreeAryTree { //3-ary 트리 관리 , 생성
    TreeNode root;

    ThreeAryTree(int val) { // 객체 생성, 루트 노드의 자식 노드 추가
        root = new TreeNode(val);
    }

    public static void main(String[] args) {
        ThreeAryTree tree = new ThreeAryTree(1);
        tree.root.child[0] = new TreeNode(2);
        tree.root.child[1] = new TreeNode(3);
        tree.root.child[2] = new TreeNode(4);
        printChild(tree.root); // 루트 노드 전달
    }


    private static void printChild(TreeNode node) {
        if (node == null || node.child == null) {
            return;
        }
        for (TreeNode nodes : node.child) {
            System.out.println(nodes.val + " ");
        }
    }
}
