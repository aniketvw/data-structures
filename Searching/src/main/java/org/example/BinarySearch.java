package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BinarySearch {

    public static void main(String[] args) {

//        int arr[]={10,20,50,54,60};
        int arr[]={10,20,30,40,50,60,70};

        System.out.println(findElement(20,arr));


    }

    private static int findElement(int target,int[]array) {

        int low=0;
        int high=array.length-1;
        while (low<=high){
            int mid=low+((high-low)/2);
            if(target==array[mid]){
                return mid;
            }
             else if (array[mid]<target){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return -1;
    }

}