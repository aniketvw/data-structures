package org.example;

import java.util.Queue;

public class QueueLinkedListImpl {

    Node front,rear;
    int size;

    QueueLinkedListImpl(){
        front=rear=null;
        size=0;
    }

    void enqueue(int x){
        Node temp=new Node(x);
        if (front==null){
            front=rear=temp;
            return;
        }
        rear.next=temp;
        rear=temp;
        size++;
    }

    void dequeue(){
        if(front==null)
            return;

        front=front.next;
        if (front==null){
            rear=null;
        }
        size--;
    }

}
