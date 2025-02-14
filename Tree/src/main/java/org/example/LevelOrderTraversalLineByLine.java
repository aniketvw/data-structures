package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLineByLine {

    public static void lineByLine(Node root){

        if (root==null)
            return;
        Queue<Node> q =new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while (q.size()>1){

            Node curr=q.poll();
            if (curr==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key+"  ");
            if (curr.left!=null)
                q.add(curr.left);
            if (curr.right!=null)
                q.add(curr.right);
        }



    }

}
