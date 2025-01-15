package org.example;
//O(n^2 )
//Less Memory writes
//NotStable
//Basic idea for HeapSort
public class SelectionSort {

    public static void main(String[] args) {
        int arr[]={10,5,8,20,2,18};

        sortIt(arr);
        for(int i:arr){
            System.out.println(i);
        }

    }

    private static void sortIt(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int min_index=i;
            for (int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int tmp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=tmp;
        }
    }


}
