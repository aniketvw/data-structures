package org.example;


public class SumOfNatural {
    public static void main(String[] args) {

        System.out.println(sumofN(5));

    }

    private static int sumofN(int number) {
        return (number*(number+1))/2;
    }
}