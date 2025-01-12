package org.example;

public class SecondLargest {


    public static void main(String[] args) {
//        int arr[]={10,5,8,20};
        int arr[]={20,10,20,8,12};
//        int arr[]={10,10,10};


        System.out.println(secondLargest(arr));

    }

    private static int secondLargest(int[] arr) {

        int largest=arr[0];
        int secondlarge=0;
        int temp;
        for (int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                temp=largest;
                largest=arr[i];
                secondlarge=temp;
            }
            if(secondlarge<arr[i]&&arr[i]<largest)
                secondlarge=arr[i];
        }
        return secondlarge;
    }

}
