package org.example;

//Count of nin zero elements gives index of next zero element. This index is used to swap non zero element.
public class MoveZeros {

    public static void main(String[] args) {
        int arr[]={8,5,0,10,0,20};

        removeZero(arr);

        for(int i:arr){
            System.out.println(i);
        }

    }

    private static void removeZero(int[] arr) {

        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int tmp =arr[count];
                arr[count]=arr[i];
                arr[i]=tmp;
                count++;// increase the count of non-zero elements
            }
        }

    }

}
