package org.example;

public class SubSequenceRecursive {

    public static void main(String[] args) {
        String s1="abcdef";
        String s2="ade";

        System.out.println(subScreener(s1,s2, s1.length(),s2.length()));

    }

    private static boolean subScreener(String s1, String s2, int i, int j) {

        if(j==0)
            return true;
        if (i==0)
            return false;
        if(s1.charAt(i-1)==s2.charAt(j-1))
            return subScreener(s1,s2,i-1,j-1);
        else
            return subScreener(s1,s2,i-1,j);


    }

}
