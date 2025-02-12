package org.example;
//Max nodes from root to leaf
public class HeightOfTree {

    static int height(Node root){

        if(root==null){
            return 0;
        }

        return Math.max(height(root.left),height(root.right))+1;


    }

}
