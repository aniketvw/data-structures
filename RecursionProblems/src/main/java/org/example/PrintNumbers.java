package org.example;

public class PrintNumbers {


    public static void main(String[] args) {

        printN(5);

    }

    private static void printN(int i) {

        if(i==0)
            return;
        System.out.println(i);
        printN(i-1);
    }

}
//Auxiliary space O(n)