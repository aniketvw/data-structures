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
        if (low==target)
            return low;
        int mid=(low+high)/2;

        if(array[mid]==target&&array[mid-1]!=target)
            return mid;
        if (array[mid-1]==target)
            return mid-1;
        if (array[mid]>target){
            return firstOccurenceR(target,low,mid-1,array);
        }else if(array[mid]<target){
           return firstOccurenceR(target,mid+1,high,array);
        }
        return -1;
    }

}
