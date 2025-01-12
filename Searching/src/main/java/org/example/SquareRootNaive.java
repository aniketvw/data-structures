package org.example;

public class SquareRootNaive {

    public static void main(String[] args) {
        System.out.println(root(9));
    }

    private static int root(int number) {
        int root=1;
        while((root*root)<=number)
            root++;
        return root-1;
    }

}
