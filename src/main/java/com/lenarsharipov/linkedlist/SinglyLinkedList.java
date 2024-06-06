package com.lenarsharipov.linkedlist;

public class SinglyLinkedList<T> {

    private Node<T> head;

    public void addFirst(T value) {
        Node<T> node = new Node<>(value);
        node.next = head;
        head = node;
    }

    public void addLast(T value) {
        var node = new Node<T>(value);
        if (head == null) {
            head = node;
            return;
        }
        var curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
    }

    public void print() {
        if (head == null) {
            System.out.println("Empty linked list");
            return;
        }
        var curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
    }

    private static class Node<T> {
        public Node<T> next;
        public T value;

        public Node(T value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        var sll = new SinglyLinkedList<Integer>();
        sll.print();
        sll.addLast(1);
        sll.addLast(2);
        sll.addLast(3);
        sll.addLast(4);
        sll.addLast(5);
        sll.addFirst(9);
        sll.addFirst(8);
        sll.addFirst(7);
        sll.print();
    }
}
