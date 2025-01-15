package org.example;

//o(n^2)
//n-1 iterations
//Stable Sort
public class BubbleSort {


    public static void main(String[] args) {
        int arr[] = {2, 10, 8, 7};

        bubble(arr);

        for (int i : arr)
            System.out.println(i);
    }

    private static void bubble(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }

    }


}
