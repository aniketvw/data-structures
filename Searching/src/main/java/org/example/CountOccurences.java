package org.example;

public class CountOccurences {

    public static void main(String[] args) {
        int [] arr={10,20,20,20,30,30};

        System.out.println(counter(arr,20));
    }

    private static int counter(int[] arr,int target) {

        int first=firstOccur(target,0,arr.length-1,arr);

        if (first==0)
            return 1;
        else
            return (lastOccur(target,0,arr.length-1,arr,arr.length-1)-first+1);

    }

    private static int lastOccur(int target, int low, int high, int[] arr, int lastElement) {
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                res=i;
            }

        }
        return res;
    }

    private static int firstOccur(int target, int low, int high, int[] arr) {

        if(low>high)
            return -1;

        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else if(mid==0||arr[mid-1]!=arr[mid]){
                return mid;
            }else {
                high=mid-1;
            }
        }
        return -1;

    }

}
