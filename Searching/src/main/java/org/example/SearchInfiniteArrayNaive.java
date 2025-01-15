package org.example;
//O(position)
public class SearchInfiniteArrayNaive {

    public static void main(String[] args) {
        int arr[]={1,10,200,210,999,99120,99221};

        System.out.println(finder(999,arr));

    }

    private static int finder(int num, int[] arr) {
        int i=0;
        while (true){
            if (arr[i]==num)
                    return i;
            if (arr[i]>num)
                return -1;
            i++;
        }
    }

}
