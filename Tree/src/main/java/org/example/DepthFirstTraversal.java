package org.example;

//Go one side traverse completely then other side
//Inorder: L Root R
//PreOrder: Root L R
//PostOrder: L R Root
public class DepthFirstTraversal {

    static void inOrder(Node root) {
        //TimeComplexity: O(N)
        //AuxiliarySpace: Height

        if (root != null) {

            inOrder(root.left);
            System.out.println(root.key);
            inOrder(root.right);

        }

    }

    static void preOrder(Node root) {
        //TimeComplexity: O(N)
        //AuxiliarySpace: Height
        if (root != null) {
            System.out.println(root.key);
            preOrder(root.left);
            preOrder(root.right);
        }

    }

    static void postOrder(Node root){
        //TimeComplexity: O(N)
        //AuxiliarySpace: Height
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.key);
        }

    }

}
