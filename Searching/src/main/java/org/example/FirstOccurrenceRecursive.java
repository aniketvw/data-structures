package org.example;

public class FirstOccurrenceRecursive {

    public static void main(String[] args) {
        int arr[]={5,10,10,15,20,20,20};
        //int arr[]={5,5,5};
        System.out.println(firstOccurenceR(20,0,arr.length-1,arr));
    }

    private static int firstOccurenceR(int target, int low, int high, int[] array){
        if(low>high)
            return -1;
        int mid=(low+high)/2;

        if(array[mid]>target){
            return firstOccurenceR(target,low,mid-1,array);
        } else if (array[mid]<target) {
            return firstOccurenceR(target,mid+1,high,array);
        } else if (mid==0||array[mid-1]!=array[mid]) {
            return mid;
        }else {
            return firstOccurenceR(target,low,mid-1,array);
        }
    }

}
