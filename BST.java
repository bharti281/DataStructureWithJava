package Apna_College;

import java.util.ArrayList;

public class BST {
     static  class  Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }

    }
    public  static  Node insert(Node root, int val){
    if(root == null) {
        root = new Node(val);
        return root;
    }
    if(root.data>val){
        root.left= insert(root.left,val);
    }
    else{
        root.right= insert(root.right,val);
    }
    return root;
    }
    //In order Traversal

    public  static  void Inorder(Node root){
         if(root==null){
             return ;
         }
        Inorder(root.left);

        System.out.print(root.data+" ");


        Inorder(root.right);
    }

    //Search in the BST
    public  static  void Search(Node root , int key){
         if(root == null){
             System.out.println("Not found");
             return;
         }
         if(root.data > key){
             Search(root.left,key);
         }
        else if(root.data == key){
             System.out.println("Value found");
         }
        else {
              Search(root.right, key);
         }

    }
    public static  Node delete(Node root, int val){
         if(root.data>val){
             root.left = delete(root.left,val);
         }
         else if(root.data<val){
             root.right = delete(root.right,val);
         }
         else {
             //case 1 for deletion
             if (root.left == null && root.right == null) {
                 return null;
             }
             //case 2 for deletion
             if (root.left == null) {
                 return root.right;
             } else if (root.right == null) {
                 return root.left;
             }
             //case 3 for deletion
             Node IS = inOrderSuccessor(root.right);
             root.data = IS.data;
             root.right = delete(root.right, IS.data);
         }
         return  root;
    }

    private static Node inOrderSuccessor(Node root) {
         while (root.left!=null){
             root = root.left;
         }
         return root;
    }
// Print in a range
    public  static  void printInRange(Node root ,int x ,int y){
         if(root==null){
             return;
         }
         if(root.data>=x && root.data<=y){
             printInRange(root.left,x,y);
             System.out.print(root.data+" ");
             printInRange(root.right,x,y);
         }
        else if(root.data>=y){
            printInRange(root.left,x,y);
         }
        else {
            printInRange(root.right,x,y);
         }
    }


    //Root to leaf path print
   public static void  printPath(ArrayList<Integer> path){
         for (int i=0;i<path.size();i++){
             System.out.print(path.get(i)+" -> ");

         }
       System.out.println();
   }
    public  static  void printRoot2Leaf(Node root, ArrayList<Integer> path){
         if(root==null){
             return;
         }
         path.add(root.data);
         if(root.left==null&&root.right==null){
             printPath(path);
         }
         else {
             printRoot2Leaf(root.left,path);
             printRoot2Leaf(root.right,path);
         }
         path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> path = new ArrayList<>();
        int value[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0;i<value.length; i++){
            root= insert(root,value[i]);
        }
        Inorder(root);
        System.out.println();
       Search(root,11);
       delete(root,5);
        Inorder(root);
        System.out.println();
        printInRange(root,6,10);
        System.out.println("Here is the leaf node path ");
        printRoot2Leaf(root,path);
     }
}
