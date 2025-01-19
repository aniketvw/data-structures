package org.example;

public class FirstOccurence {

    public static void main(String[] args) {
        int arr[] ={5,10,10,20,20};
        System.out.println(firstOccurence(arr,10));
    }

    private static int firstOccurence(int[] arr, int target) {

        int high= arr.length-1;
        int low=0;
        while (low<=high){
            int mid= (low+high)/2;
            if (arr[mid]>target)
                high=mid-1;
            else if(arr[mid]<target)
                low=mid+1;
            else {
                if (mid==0||arr[mid-1]!=arr[mid])
                    return mid;
                else
                    high=mid-1;// not first occurrence, go to left
            }

        }
        return -1;

    }

}
