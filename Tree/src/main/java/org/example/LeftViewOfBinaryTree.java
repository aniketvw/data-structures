package org.example;
//Initialise level 1
public class LeftViewOfBinaryTree {

    int maxLevel=0;

    void leftView(Node root,int level){

        if(root==null) return;

        if (maxLevel<level){
            System.out.println(root.key+" ");
            maxLevel=level;
        }

        leftView(root.left,level+1);
        leftView(root.right,level+1);


    }


}
