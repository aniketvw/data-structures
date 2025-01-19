package org.example;
//elements smaller than   should be before it and larger after it
public class PartitionArray {

    public static void main(String[] args) {
      int arr[]={5,13,6,9,12,11,8};

//      naivePartition(arr,6);

      for(int i:arr)
          System.out.println(i);

    }

//    private static void naivePartition(int[] arr, int pivot) {
//
//        int low=0,high=arr.length-1;
//        int index=0;
//        int tmp[]=new int[high-low+1];
//
//        for (int i=low;i<=high;i++){
//            if (arr[i]<=pivot){
//                tmp[index]=arr[i];
//                index++;
//            }
//        }
//        for (int i=low;i<=high;i++){
//            if (arr[i]>arr[pivot]){
//                tmp[index]=arr[i];
//                index++;
//            }
//
//        }
//
//        for (int i=low;i<=high;i++){
//            arr[i]=tmp[i-low];
//        }
//
//    }

}
