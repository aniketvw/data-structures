package org.example;
//O(n)
//Ensures all smaller element are to left and all larger around right across a returned pivot
//Left: less than pivot / right greater than equal to pivot
//unstable
public class HoaresPartition {

    public static void main(String[] args) {
        int array[]={5,3,8,4,2,7,1,10};

        System.out.println(hoaresPartition(array,0, array.length-1));

        for (int i: array)
            System.out.println(i);
    }

    private static int hoaresPartition(int[] array, int l, int lastIndex) {
        int pivot=array[l];
        int i=l-1, j=lastIndex+1;
        while (true){
            do {
                i++;
            }while (array[i]<pivot);
            do {
                j--;
            }while (array[j]>pivot);
            if (i>=j) return j;
            int tmp=array[i];
            array[i]=array[j];
            array[j]=tmp;
        }
    }

}
