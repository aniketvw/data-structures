package org.example;
//O(m+n)
public class MergeSortFunction {

   public void merge(int a[],int low,int mid,int high)
   {
       int n1 = mid - low + 1, n2 = high - mid;

       int left[] = new int[n1];
       int right[] = new int[n2];

       for (int i = 0; i < n1; i++) {
           left[i] = a[low + i]; // Correct index
       }
       for (int i = 0; i < n2; i++) {
           right[i] = a[mid + 1 + i]; // Correct index
       }

       int i = 0, j = 0, k = low; // Start `k` from `low`

       while (i < n1 && j < n2) {
           if (left[i] <= right[j]) {
               a[k] = left[i];
               i++;
           } else {
               a[k] = right[j];
               j++;
           }
           k++;
       }

       while (i < n1) {
           a[k] = left[i];
           i++;
           k++;
       }

       while (j < n2) {
           a[k] = right[j];
           j++;
           k++;
       }
   }
}
