package org.example;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(digitSum(10));
    }

    private static int digitSum(int digit) {

        if (digit==0)
            return 0;

        return (digit%10)+digitSum(digit/10);

    }

}//TimeComplexity: O(n)....SpaceComplexity: O(n)
