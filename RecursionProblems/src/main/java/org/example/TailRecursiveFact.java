package org.example;

public class TailRecursiveFact {


    public static void main(String[] args) {
        factorial(5,1);
    }

    private static int factorial(int n, int k) {

        if(n==0||n==1){
            return k;
        }
      return   factorial(n-1,k*n);

    }

}
