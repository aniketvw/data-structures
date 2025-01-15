package org.example;


//0(log(pos))
//UnboundedBinarySearch
public class SearchInfiniteArray  {

    public static void main(String[] args) {
        int arr[]={1,10,200,210,999,99120,99221};

        System.out.println(effiSearch(arr,99120));

    }

    private static int effiSearch(int[] arr, int num) {
        if(arr[0]==num) return 0;
        int i=1;
        while (arr[i]<num){
            i=i*2;
            if(arr[i]==num)
                return i;

        }
//        return bS(arr,num,low:((i/2)+1),high:i-1);
        return num;
    }

}
