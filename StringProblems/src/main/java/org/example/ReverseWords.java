package org.example;

public class ReverseWords {

    public static void main(String[] args) {
        String s="welcome to gfg";
        char []str= s.toCharArray();
        char[] res=reverser(str);
        String result =new String(res);
        System.out.println(result);

    }

    private static char[] reverser(char[] str) {

        int begin=0;
        for(int end=0;end<str.length;end++){

            if(str[end]==' '){
                rev(str,begin,end-1);
                begin=end+1;
            }

        }
        rev(str,begin,str.length-1);// reverse last word
        rev(str,0, str.length-1);
        return str;
    }

    private static void rev(char[] str, int begin, int end) {
        while(begin<=end){
            char tmp=str[begin];
            str[begin]=str[end];
            str[end]=tmp;
            begin++;
            end--;

        }

    }


}
