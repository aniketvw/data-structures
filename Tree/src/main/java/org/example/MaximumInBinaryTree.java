package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumInBinaryTree {

    public static int maxInTree(Node root){

        if (root==null)
            return -1;
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        int max=0;
        while (queue.isEmpty()==false){
            Node curr=queue.poll();

            if (curr.key>max){
                max= curr.key;
            }
            if (curr.left!=null){
                queue.add(curr.left);
            }
            if (curr.right!=null){
                queue.add(curr.right);
            }

        }
        return max;

    }

}
