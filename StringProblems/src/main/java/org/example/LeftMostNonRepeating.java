package org.example;

public class LeftMostNonRepeating {

    private static final int CHAR=256;

    public static void main(String[] args) {

        String s="abccad";
        int res;
        boolean [] visited=new boolean[CHAR];
        for(int i=s.length()-1;i>=0;i--){

            if(!visited[s.charAt(i)]){
                res=i;
                visited[s.charAt(i)]=true;
            }
//Incomp
        }



    }

}
