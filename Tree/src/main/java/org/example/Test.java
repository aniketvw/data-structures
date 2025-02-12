package org.example;

public class Test {

    public static void main(String[] args) {

        //root=null empty tree

        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
//        root.right.right=new Node(50);
//        root.right.left=new Node(40);

        DepthFirstTraversal.inOrder(root);
        System.out.println("-----");
        DepthFirstTraversal.preOrder(root);
        System.out.println("-----");
        DepthFirstTraversal.postOrder(root);
        System.out.println("-----");
        System.out.println(HeightOfTree.height(root));

        Node kRoot=new Node(10);
        kRoot.left=new Node(20);
        kRoot.right=new Node(8);
        kRoot.right.right=new Node(7);
        kRoot.right.right.left=new Node(11);
        kRoot.right.right.right=new Node(12);
        System.out.println("-----");
        NodesAtK.printK(kRoot,2);


    }

}
