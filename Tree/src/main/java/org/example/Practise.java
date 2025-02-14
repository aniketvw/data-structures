package org.example;

public class Practise {

    public static void nodeAtK(Node root, int k){

        if(k==0){
            System.out.println(root.key);
            return;
        }else if (root!=null){
            nodeAtK(root.left,k-1);
            nodeAtK(root.right,k-1);
        }


    }


}
