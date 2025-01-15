package org.example;

public class MergeTwoSortedApplication {

    public static void main(String[] args) {

        int arr[]={10,15,20,40,8,11,55};
        int low=0,mid=3,high=6;

        mSortA(arr,low,mid,high);
        for(int i:arr){
            System.out.println(i);
        }

    }

    private static void mSortA(int[] arr, int low, int mid, int high) {
        int [] a=new int[mid-low+1];
        int []b= new int [high-mid];
        for(int i=0;i<=mid;i++){
            a[i]=arr[i];
        }
        int c=0;
        for(int j=mid+1;j<=high;j++){
            b[c]=arr[j];
            c++;
        }

        int x=0,y=0,z=0;

        while (x<a.length&&y< b.length){
            if(a[x]<=b[y]){
                arr[z]=a[x];
                x++;
            }else {
                arr[z]=b[y];
                y++;
            }
            z++;
        }
        while (x<a.length){
            arr[z]=a[x];
            x++;
            z++;
        }
        while (y<b.length){
            arr[z]=b[y];
            y++;
            z++;
        }
    }

}
