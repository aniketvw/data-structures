package org.example;

public class Test {

    public static void main(String[] args) {
        MyStack s=new MyStack(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        s.push(30);
    }

}
