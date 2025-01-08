package org.example;

public class PrintNumbersStraightTailRecursive {

    public static void main(String[] args) {
        printNum(5,1);
    }

    private static void printNum(int i,int k) {

        if(i==0)
            return;

        System.out.println(k);

        printNum(i-1,k+1);

    }

}
