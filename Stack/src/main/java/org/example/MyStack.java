package org.example;

public class MyStack {

    int [] arr;
    int top;
    int cap;

    public MyStack(int cap) {
        arr = new int[cap];
        top=-1;
        this.cap = cap;
    }

    void push(int x){

        if(top==(cap-1)){
            System.out.println("At Capacity!");
        }

        top++;
        arr[top]=x;
    }
    int pop(){
        if(top==-1){
            System.out.println("Empty!");
        }
        int res=arr[top];
        top --;
        return res;
    }

    int peek(){
        if (top==-1){
            return -1;
        }else {
            return arr[top];
        }
    }

    int size(){
        return top+1;
    }

}
