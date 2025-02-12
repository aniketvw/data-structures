package org.example;

public class NodesAtK {

//    static void printK(Node root,int k,int level){
//
//        if(level==k+1){
//            System.out.println(root.key);
//            return ;
//        }
//
//        if(root.left!=null){
//            printK(root.left,k,level+1);
//        }
//
//        if(root.right!=null){
//            printK(root.right,k,level+1);
//        }
//
//
//    }

    static void printK(Node root,int k){
        if(root==null) return;
        if(k==0){
            System.out.println(root.key);
        }else {
            printK(root.left,k-1);
            printK(root.right,k-1);
        }


    }

}
