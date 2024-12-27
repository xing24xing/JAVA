package Tree;

import java.util.*;

public class LevelOrderTravesal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Tree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node n = new Node(nodes[idx]);
            n.left = buildTree(nodes);
            n.right = buildTree(nodes);
            return n;
        }

        public static void levelOrder(Node root) {
//            if(root == null){return;}
//           Queue<Node> q = new LinkedList<>();
//        q.add(root);
//        q.add(null);
//        while(!q.isEmpty()){
//            Node cur = q.poll();
//            if(cur == null){
//                System.out.println();
//                if(q.isEmpty()){
//                    break;
//                }else{
//                    q.add(null);
//                }
//            }else{
//                System.out.print(cur.data+" ");
//                if(cur.left != null){
//                    q.add(cur.left);
//                }
//                if(cur.right != null){
//                    q.add(cur.right);
//                }
//            }
//        }
//    }
               if (root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                int size = q.size(); // Number of nodes at the current level
                for (int i = 0; i < size; i++) {
                    Node cur = q.poll();
                    System.out.print(cur.data + " ");
                    if (cur.left != null) {
                        q.add(cur.left);
                    }
                    if (cur.right != null) {
                        q.add(cur.right);
                    }
                }
                System.out.println(); // New line after each level
            }
        }

    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Tree t = new Tree();
        Node root = t.buildTree(nodes);
        System.out.println("Level Order Traversal:");
        Tree.levelOrder(root);
    }
}
