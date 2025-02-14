package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfBinaryTree {

    public static int sizeOfTree(Node root){

        if (root==null){
            return 0;
        }

        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        int size=0;
        while (queue.isEmpty()==false){
            size++;
           Node curr= queue.poll();
           if (curr.left!=null){
               queue.add(curr.left);
           }
           if (curr.right!=null){
               queue.add(curr.right);
           }
        }
        return size;

    }


}
