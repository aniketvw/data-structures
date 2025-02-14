package org.example;

import java.util.LinkedList;
import java.util.Queue;

//print level by level
//O(N)
public class LevelOrderOrBFS {

    public  static void levelOrderTraversal(Node root) {

        if (root == null)
            return;

        Queue<Node> q = new LinkedList<Node>();

        q.add(root);

        while (q.isEmpty() == false) {

            Node curr = q.poll();
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);

        }


    }

}
