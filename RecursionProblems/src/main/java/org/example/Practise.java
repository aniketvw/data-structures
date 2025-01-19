package org.example;

public class Practise {

    public static void main(String[] args) {
        String string="geks";

        System.out.println(remember(string,0,string.length()-1));

    }

    private static boolean remember(String string, int low, int high) {

        if(low>=high)
            return true;
        if (string.charAt(low)!=string.charAt(high))
            return false;

        return remember(string,low+1,high-1);


    }


}
