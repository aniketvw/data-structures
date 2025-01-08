package org.example;

public class PalindromCheck {


    public static void main(String[] args) {
        String word="geeks";

        System.out.println(checker(word,0,word.length()-1));

    }

    private static boolean checker(String word, int begin, int end) {

        if(begin>=end)
            return true;
        if(word.charAt(begin)!=word.charAt(end))
            return false;
        return checker(word,begin+1,end-1);//return ((word.charAt(begin)!=word.charAt(end))&&checker(word,begin+1,end-1));

    }

}//TimeComplexity: O(n)...AuxiliarySpace: O(n)
