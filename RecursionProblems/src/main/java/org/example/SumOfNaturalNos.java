package org.example;

public class SumOfNaturalNos {

    public static void main(String[] args) {
        System.out.println(sumN(5));
    }

    private static int sumN(int n) {

        if (n==0)
            return 0;
        return n+sumN(n-1);
    }

}
