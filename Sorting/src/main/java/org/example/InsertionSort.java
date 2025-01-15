package org.example;

//O(n^2)
//In place and stable
//Auxiliary space O(1)
//Most efficient for small arrays(TimSort and IntroSort)
//O(n) best case
public class InsertionSort {

    public static void main(String[] args) {

        int arr[] = {2, 5, 40, 60, 10, 30};

        iSort(arr);

        for (int i : arr)
            System.out.println(i);

    }

    private static void iSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

    }

}
