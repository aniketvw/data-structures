package org.example;

public class LastOccurence {

    public static void main(String[] args) {
        int arr[]={5,10,10,10,10,20,20};

        System.out.println(lastOccurence(arr,10));
    }

    private static int lastOccurence(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=(high+low)/2;
            if(arr[mid]<target){
                low=mid+1;
            } else if (arr[mid]>target) {
                high=mid-1;
            }else {
                if (mid==0||arr[mid+1]!=arr[mid]){
                    return mid;
                }else {
                    low=mid+1;
                }
            }
        }
        return -1;

    }

}
