package org.example;

//
public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {

//        int a[]={3,5,8};
//        int b[]={2,8,9,10,15};
        int a[]={10,20,20};
        int b[]={5,20,40,40};

        unionator(a,b);


    }

    private static void unionator(int[] array1, int[] array2) {

        int i=0,j=0;
        int counter=0;
        while (i<array1.length&&j<array2.length){
            if(array1[i]<=array2[j]){
                if(counter!=array1[i]) {
                    counter = array1[i];
                    System.out.println(array1[i]);
                }
                i++;
            }else {
                if(counter!=array2[j]) {
                    counter = array2[j];
                    System.out.println(array2[j]);
                }
                j++;
            }
        }
        while (i<array1.length){
            if(counter!=array1[i]) {
                counter = array1[i];
                System.out.println(array1[i]);
            }
            i++;

        }
        while (j<array2.length){
            if(counter!=array2[j]) {
                counter = array2[j];
                System.out.println(array2[j]);
            }
            j++;

        }


    }

}
