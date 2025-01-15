package org.example;
//O(m+n)
public class MergeTwoSortedArray {

    public static void main(String[] args) {

        int arr[]={10,15,20};
        int brr[]={5,6,6,15};

        mergeIt(arr,brr);

    }

    private static void mergeIt(int[] arr, int[] brr) {


        int i=0; int j=0;
        while (i< arr.length&&j< brr.length){

            if (arr[i]<=brr[j]){
                System.out.println(arr[i]);
                i++;
            }else {
                System.out.println(brr[j]);
                j++;
            }

        }
        while (i< arr.length){
            System.out.println(arr[i]);
            i++;
        }
        while (j< brr.length){
            System.out.println(arr[j]);
            j++;
        }

    }

}
