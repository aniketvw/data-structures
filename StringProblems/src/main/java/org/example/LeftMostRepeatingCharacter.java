package org.example;
//Two for loop wala practise karo hardum
public class LeftMostRepeatingCharacter {
    private static final int CHAR=256;
    public static void main(String[] args) {
        boolean[] visited=new boolean[CHAR];

        String str="abccbd";
        int res=-1;

        for(int i=str.length()-1;i>=0;i--){
            if (visited[str.charAt(i)]){
                res=i; //jo sabse pehle repeated hoga uska result pehle aaygea na
            }else {
                visited[str.charAt(i)]=true;
            }
        }
        System.out.println(res);
    }

}
