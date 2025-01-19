package org.example;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        System.out.println(searchB(arr,10));

    }

    private static int searchB(int[] arr, int target) {

        int low=0;
        int high=arr.length-1;

        while (low<=high){
            int mid=(high+low)/2;

            if(arr[mid]==target){
                return mid;
            } else if (arr[mid] > target) {
                high=mid-1;
            }else {
                low=mid+1;
            }

        }
        return -1;

    }

}
