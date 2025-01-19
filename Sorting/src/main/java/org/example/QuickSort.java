package org.example;
//O(n^2)
//Still faster than mergeSort: In-place/Cache friendly/Average case O(nlogn)/tail recursive
//Unstable
public class  QuickSort {

    public static void main(String[] args) {

        int [] arr={8,4,7,9,3,10,5};

         qSort(arr,0,arr.length-1);

         for (int i:arr)
             System.out.println(i);

    }

    private static void qSort(int[] arr, int low, int high) {

        if(low<high){


            int p= lomutoP(arr,low,high);
            qSort(arr,low,p-1);
            qSort(arr,p+1,high);

        }

    }

    private static int lomutoP(int[] arr, int low, int high) {

        int i=low-1;
        int pivot=arr[high];

        for(int j=low;j<=high-1;j++){

            if (arr[j]<pivot){
                i++;
                int tmp=arr[j];
                arr[j]=arr[i];
                arr[i]=tmp;
            }

        }
        int tmp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=tmp;
        return i+1;

    }

}
