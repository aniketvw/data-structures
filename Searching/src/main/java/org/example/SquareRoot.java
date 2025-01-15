package org.example;

public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(rootEfficient(10));
    }

    private static int rootEfficient(int x){

        int low=1; int high=x; int ans=-1;

        while (low<=high){
            int mid=(low+high)/2;
            int mSquare=mid*mid;
            if(mSquare==x)
                return mid;
            else if (mSquare>x){
                high=mid-1;
            }else {
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
}
