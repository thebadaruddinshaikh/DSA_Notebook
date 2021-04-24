package Algorithms.PathFinding;

import java.util.*;

class Traversal {
    List<Integer> order = new ArrayList();

    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            order.add(node.val);
            inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal(TreeNode node) {
        if (node != null) {
            order.add(node.val);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }

    }

    public void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            order.add(node.val);
        }
    }

    public List<Integer> LevelOrderTraversal() {
        return new ArrayList();
    }
}