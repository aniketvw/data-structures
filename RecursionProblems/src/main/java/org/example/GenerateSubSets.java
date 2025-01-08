package org.example;

//All distinct character
//binary tree
//depth first traversal
//first consider exclusions and then inclusions
//i+1 tree ka level badhane ke liye hota hai
//base case hai ki i pura string ka characters check kare for each decision point
public class GenerateSubSets {

    public static void main(String[] args) {
        String string="abc";

        generateSet(string,"",0);

    }

    private static void generateSet(String string, String current, int i) {

         if(i==string.length())
        {
            System.out.println(current);
            return;
        }
        generateSet(string,current,i+1);//Exclude
        generateSet(string,current+string.charAt(i),i+1);//include
    }

}
