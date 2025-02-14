package org.example;

public class QueueImp {

    int [] arr;
    int front,cap,size;

    public QueueImp(int c){

        arr=new int[c];
        cap=c;
        front=0;
        size=0;
    }

    public void enqueue(int x){

        if(isFull()) return;
        int rear=getRear();
        rear=(rear+1)%cap;
        arr[rear]=x;
        size++;

    }

    public void dequeue(){
        if(isEmpti()) return;
        front=(front+1)%cap;
        size--;
    }

    private int getRear() {
        if(isEmpti()){
            return -1;
        }else {
            return (front+size-1)%cap;
        }
    }

    private boolean isEmpti() {
        return (size==0);
    }

    private boolean isFull() {
        return (cap==size);
    }

}
