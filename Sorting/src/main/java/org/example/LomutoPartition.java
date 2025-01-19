package org.example;
//O(n) complexity and O(1) auxiliary space
//slidingWindow
public class LomutoPartition {

    public static void main(String[] args) {
//        int arr[]={10,80,30,90,40,50,70};
//        int arr[]={2,5,40,60,10,30};
//        int arr[]={30,40,20,50,80};
        int arr[]={50,30,20,10,5,11};

        System.out.println(lomuto(arr,2,0, arr.length-1));
        for(int i:arr)
            System.out.println(i);
    }

    public static int lomuto(int[] arr, int pivot,int low,int lastIndex) {

        if(pivot!= (arr.length-1)){
            int tmp=arr[pivot];
            arr[pivot]=arr[arr.length-1];
            arr[arr.length-1]=tmp;
            pivot= arr.length-1;
        }
        int i=low-1;
        for (int j=low;j<=lastIndex-1;j++){
            if(arr[j]<arr[pivot]){
                i++;
                int tmp=arr[j];
                arr[j]=arr[i];
                arr[i]=tmp;
            }
        }
        int tmp=arr[i+1];
        arr[i+1]=arr[pivot];
        arr[pivot]=tmp;
        return i+1;
    }

}
