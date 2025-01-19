package org.example;

public class Practise {

    public static void main(String[] args) {

        int arr[]={10,15,20,40,8,11,55};
        int low=0,mid=3,high=6;
        selectIt(arr,low,mid,high);
        for(int i: arr){
            System.out.println(i);
        }

    }

    private static void selectIt(int[] arr, int low, int mid, int high) {
        int []a= new int[mid-low+1];
        int []b=new int[high-mid];

        for (int i=0;i<=mid;i++){
            a[i]=arr[i];
        }
        int c=0;
        for (int i=mid+1;i<=high;i++){
            b[c]=arr[i];
            c++;
        }
        int i=0;int j=0;int z=0;
        while(i<a.length&&j<b.length){
            if(a[i]<=b[j]){
                arr[i]=a[i];
                i++;
            }else {
                arr[j]=b[j];
                j++;
            }
            z++;
        }
        while (i<a.length){
            arr[z]=a[i];
            i++;
            z++;
        }
        while (j<b.length){
            arr[z]=b[j];
            j++;
            z++;
        }


    }

}
