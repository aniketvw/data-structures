package org.example;

public class BinarySearchRecursive {

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};

        System.out.println(recursiveB(90,0, arr.length-1,arr ));

    }

    private static int recursiveB(int target,int low,int high,int[] array){
        if (low>high)
            return -1;
        int mid=(low+high)/2;

        if(array[mid]==target){
            return mid;
        }
        else if (array[mid]<target){
            return recursiveB(target,mid+1,high,array);
        }else if (array[mid]>target) {
            return  recursiveB(target,low,mid-1,array);
        }
        return -1;

    }



}
