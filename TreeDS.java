package Apna_College;

import javax.swing.plaf.metal.MetalTheme;
import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class TreeDS {
    static  class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node BuildTree(int Node[]) {
            idx++;
            if (Node[idx] == -1) {
                    return null;
            }
             Node newNode = new Node(Node[idx]);
             newNode.left = BuildTree(Node);
             newNode.right = BuildTree(Node);
             return newNode;
        }
    }
    //Traversal Code PreOrder

    public  static  void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.println(root.data + " ");
        preOrder(root.left );
        preOrder(root.right );
    }
    //Traversal Code InOrder

    public  static  void InOrder(Node root){
        if(root == null){
            return;
        }


        InOrder(root.left );
        System.out.println(root.data + " ");
        InOrder(root.right );
    }
    public static  void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }
    //Level order traversal
    public  static  void levelOrder(Node root){
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }else {
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if (currNode.right!= null){
                    q.add(currNode.right);
                }
            }

        }
    }

//count the node

    public  static  int countNode(Node root){
        if(root == null){
            return 0;
        }
        int leftNode = countNode(root.left);
        int rightNode = countNode(root.right);
        return  leftNode+rightNode+1;
    }

    //Sum of the nodes
    public  static  int sumOfNode(Node root){
        if(root == null){
            return  0;
        }
        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);
        return  leftSum+rightSum+root.data;
    }
//    height of the tree
    public  static  int height (Node root){
        if(root == null){
            return  0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int myHeight = Math.max(leftHeight,rightHeight)+1;
        return myHeight;
    }
    // Find the Tree diameter
    public  static  int diameter(Node root){
        if(root == null){
            return  0;
        }
        int dim1 = diameter(root.left);
        int dim2 = diameter(root.right);
        int dim3 = height(root.left) + height(root.right)+1;
        return Math.max(dim3,Math.max(dim1,dim2));
    }
    // Find the Tree diameter second approach
    static  class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }

    }
    // Find the Tree diameter second approach
    public  static  TreeInfo diameter2(Node root){
        if(root == null){
            return  new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        int myHeight = Math.max(left.ht,right.ht)+1;
        int dim1 = left.diam;
        int dim2 = right.diam;
        int dim3 = left.ht+right.ht+1;
        int mydiam = Math.max(Math.max(dim1,dim2),dim3);
        TreeInfo myinfo = new TreeInfo(myHeight,mydiam);
        return myinfo;

    }
        //find the subtree

    public static boolean isSubtree (Node root,Node subroot){
        if(subroot == null){
            return  true;
        }
        if(root == null){
            return  false ;
        }

        if(isIdentical(root,subroot)){
            return true;
        }
        return isSubtree(root.left,subroot.left)||isSubtree(root.right,subroot.right);
    }

    private static boolean  isIdentical(Node root, Node subroot) {
        if(subroot ==null && root==null){
            return true;
        }
        if(root==null||subroot==null){
            return  false;
        }
        if(root.data == subroot.data){
            return isIdentical(root.left,subroot.left)&& isIdentical(root.right,subroot.right);
        }
        return false;
    }

    public static void main(String[] args) {
        int Nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,};
//        int Nodes2[] = {2,4,-1,-1,5,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(Nodes);
//        Node root2 = tree.BuildTree(Nodes2);
//        preOrder(root);
//        InOrder(root);
//        postOrder(root);s

        levelOrder(root);
        System.out.println("Number of node is = " +countNode(root));
        System.out.println("Sum of the node is = "+sumOfNode(root));
        System.out.println("Height of the tree is = "+height(root));
        System.out.println("diameter of the tree is = "+diameter(root));
        System.out.println("diameter of the tree is = "+diameter2(root).diam);
//        isSubtree(root,root2);


    }
}
