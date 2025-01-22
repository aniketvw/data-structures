package org.example;


//Obtained by removing 0 or more characters order same. Number of subsequences 2^n
public class Subsequence {

    public static void main(String[] args) {
        String s1="geeksforgeeks";
        String s2="grges";

        int i=0, j=0;

        while(i<s1.length()){
            if (s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }else {
                i++;
            }
        }

        if(j!=(s2.length()))
            System.out.println("FALSE");
        else
            System.out.println("TRUE");

    }

}
