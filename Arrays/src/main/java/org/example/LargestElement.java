package org.example;

public class LargestElement {

    public static void main(String[] args) {

//        int arr []={10,5,20,8};
        int arr []={40,8,50,100};

        System.out.println(findLargest(arr));

    }

    private static int findLargest(int[] arr) {

        int largest= arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest)
                largest=arr[i];

        }
        return largest;
    }

}