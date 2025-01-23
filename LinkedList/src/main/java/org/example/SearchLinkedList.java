package org.example;

public class SearchLinkedList {

    public static int iterativeSearch(Node head, int data){

        int pos=1;
         Node current=head;
         while (current!=null){
             if(current.data==data){
                 return pos;
             }else {
                 pos++;
                 current=current.next;
             }
         }
        return -1;

    }

    public static int recursiveSearch(Node head,int data){
        if (head==null) return -1;
        if (head.data==data)
            return 1;
        else {
            int res= recursiveSearch(head.next,data);
            if (res==-1){
                return -1;
            }else {
                return (res+1);
            }
        }
    }

}
