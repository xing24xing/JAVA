/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BinaryTree;

import static BinaryTree.BuildTree.tree.inOrder;
import static BinaryTree.BuildTree.tree.postOrder;
import static BinaryTree.BuildTree.tree.preOrder;

/**
 *
 * @author khushi pandey
 */
public class BuildTree {
     static class Node{
         int data;
         Node left;
         Node right;
         Node(int data){
             this.data = data;
             this.left = null;
             this.right = null;
         }
     }
     static class tree{
         static int idx = -1; 
         public static Node buildTree(int nodes[]){
             idx++;
             if(nodes[idx] == -1){
                 return null;
             }
             Node n = new Node(nodes[idx]);
             n.left = buildTree(nodes);
             n.right = buildTree(nodes);
//             System.out.println(n.data);
             return n;
             
         }
         public static void preOrder(Node root){
             if(root == null){
                 return;
             }
             System.out.print(root.data+" ");
             preOrder(root.left);
             preOrder(root.right);
         }
         
         public static void inOrder(Node root){
             if(root == null){
                 return;
             }
             inOrder(root.left);
             System.out.print(root.data+" ");
             inOrder(root.right);
         }
         public static void postOrder(Node root){
             if(root == null){
                 return;
             }
             postOrder(root.left);
             postOrder(root.right);
             System.out.print(root.data+" ");
         }
     }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        tree t = new tree();
        Node root = t.buildTree(nodes);
        System.out.println(root.data);
        preOrder(root);
        System.out.println("");
        inOrder(root);
        System.out.println("");
        postOrder(root);
        
    }
    
}
