package org.example;

public class PrintNumbersStraight {

    public static void main(String[] args) {
        printNum(5);
    }

    private static void printNum(int i) {

        if(i==0)
            return;
        printNum(i-1);
        System.out.println(i);
    }

}
