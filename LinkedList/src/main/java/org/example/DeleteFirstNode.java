package org.example;

public class DeleteFirstNode {

    public static Node deleteFirst(Node head){

        if(head==null)
            return null;
        else
            return head.next;


    }

}
