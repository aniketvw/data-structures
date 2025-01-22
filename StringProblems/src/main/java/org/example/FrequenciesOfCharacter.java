package org.example;
//Print in sorted order
public class FrequenciesOfCharacter {

    public static void main(String[] args) {
        String str="geeksforgeeks";

        System.out.println(str.charAt(2));

        int []array=new int[26];

        for(int i=0;i<str.length();i++){
            array[str.charAt(i)-'a']++;
        }
        for(int i=0;i< 26;i++){
            if (array[i]>0)
                System.out.println((char)(i+'a')+ " " + array[i]);
        }


    }

}
