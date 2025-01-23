package org.example;

public class Node {

    int data;

    Node next;//self referential structure

    Node(int x){
        data=x;
        next=null;
    }

}
