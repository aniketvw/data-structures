package org.example;

public class InsertAtGivenPos{

    public static Node insertAnywhere(Node head,int position, int data){

        Node insertion=new Node(data);

        if(position==1){
            insertion.next=head;
            return insertion;
        }

        Node current=head;
        for(int i=1;(i<=position-2)&&(current!=null);i++){
            current=current.next;
        }
        if(current==null)
            return head;
        insertion.next=current.next;
        current.next=insertion;
        return head;


    }

}
