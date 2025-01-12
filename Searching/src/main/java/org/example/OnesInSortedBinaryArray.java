package org.example;

public class OnesInSortedBinaryArray {

    public static void main(String[] args) {
        int[] array={0,0,1,1,1,1,1};
        System.out.println(count1s(array));
    }

    private static int count1s(int[] array) {
        int low=0;
        int high=array.length-1;

        while (low<=high){
            int mid=(high+low)/2;
            if(array[mid]==0){
                low=mid+1;
            }else if (mid==0||array[mid-1]!=array[mid]){
                return ((array.length)-mid);
            }else {
                high=mid-1;
            }
        }
        return 0;

    }

}
