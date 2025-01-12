package org.example;

public class RemoveDuplicatesSorted {

    public static void main(String[] args) {

        int arr[]= {10,20,20,30,30,30,30};

        System.out.println(remover(arr));


    }


    private static int remover(int[] arr) {

        int size=1; //minimum size we can return will be 1

        for (int i=1;i< arr.length;i++){

            if (arr[i]!=arr[size-1]){
                arr[size]=arr[i];
                size++;
            }

        }
        return size;
    }

}
