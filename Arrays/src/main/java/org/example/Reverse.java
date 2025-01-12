package org.example;

public class Reverse {

    public static void main(String[] args) {

        int arr[]={10,5,7,30};

        reverser(arr);
        for (int a:arr){
            System.out.println(a);
        }

    }

    private static int[] reverser(int[] arr) {

        int begin=0;
        int end= arr.length-1;
        while(begin<end){
            int temp=arr[begin];
            arr[begin]=arr[end];
            arr[end]=temp;
            begin++;
            end--;
        }
        return arr;
    }

}
