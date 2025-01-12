package org.example;

public class LastOccurrenceRecursive {

    public static void main(String[] args) {
        int [] array={5,10,10,10,10,20,20};

        System.out.println(lastOccurrRecu(10,0,array.length-1,array,array.length-1));

    }

    private static int lastOccurrRecu(int target, int low, int high, int[] array, int lastElement) {

        if(low>high) return -1;

        int mid=(low+high)/2;

        if (array[mid]>target){
            return lastOccurrRecu(target,low,mid-1,array,lastElement);
        }else if(array[mid]<target){
            return lastOccurrRecu(target,mid+1,high,array,lastElement);
        }else{
            if (mid==lastElement||array[mid+1]!=array[mid]){
                return mid;
            }else {
                return lastOccurrRecu(target,mid+1,high,array,lastElement);
            }
        }


    }

}
