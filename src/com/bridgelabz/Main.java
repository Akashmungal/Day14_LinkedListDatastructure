package com.bridgelabz;

public class Main {

    public static void main(String[] args) {
        LinkedList list =new LinkedList();
        list.addLast(56);
        list.addLast(70);
        list.addLast(80);
        list.addLast(90);
        list.insertAfter(90, 100);
        list.delete(56);
        list.insertBetween(70, 80, 30);//Inserting 30 between 56 & 70
        list.ascOrder();
        list.printList();
        System.out.println(list.search(100));
        System.out.println(list.getSize());
    }
}