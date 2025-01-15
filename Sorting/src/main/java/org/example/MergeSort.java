package org.example;

//Divide and Conquer
//Stable
//O(n logn) and O(n) Auxiliary space
//Well suited for linked Lists
//For arrays quickSort is better
public class MergeSort {

    public static void main(String[] args) {
        int arr[]={10,5,30,15,7};

        mergeSort(arr,0,arr.length-1);

        for(int i:arr){
            System.out.println(i);
        }

    }

    private static void mergeSort(int[] arr, int l, int r) {

        if(r>l)//check if arr has at least two elements
        {
            int mid=l+((r-l)/2);
            //recursively sort two halves
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            new MergeSortFunction().merge(arr,l,mid,r);
        }

    }

}
