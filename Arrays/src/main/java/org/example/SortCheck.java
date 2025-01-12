package org.example;

public class SortCheck {


    public static void main(String[] args) {

//        int arr[]={8,12,15};
//        int arr[]={8,10,10,12};
//        int arr[]={100};
        int arr[]={100,20,200};

        System.out.println(sorter(arr));
    }

    private static boolean sorter(int[] arr) {
        for(int i=arr.length-1;i>=1;i--){
            if(arr[i-1]>arr[i])
                return false;
        }
        return true;
    }

}
