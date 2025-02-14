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
        LevelOrderOrBFS.levelOrderTraversal(kRoot);
        System.out.println("-----");
        Node lRoot=new Node(10);
        lRoot.left=new Node(20);
        lRoot.left.left=new Node(40);
        lRoot.right=new Node(30);
        LevelOrderTraversalLineByLine.lineByLine(kRoot);
        System.out.println("____________");
        Node sNode=new Node(10);
        sNode.left=new Node(80);
        sNode.left.left=new Node(30);
        sNode.left.right=new Node(40);
        sNode.right=new Node(70);
        System.out.println(SizeOfBinaryTree.sizeOfTree(sNode));
        System.out.println("------------");

        Node maxInNode=new Node(10);
        maxInNode.left=new Node(30);
        maxInNode.right=new Node(40);
        maxInNode.left.left=new Node(80);
        maxInNode.left.left.right=new Node(70);
        maxInNode.right.right=new Node(20);
        maxInNode.right.left=new Node(60);

        System.out.println(MaximumInBinaryTree.maxInTree(maxInNode));

    }

}
