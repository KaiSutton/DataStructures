package com.prog2.datastructers;

import com.prog2.interfaces.List;


/**
 * singly but befrore
 *
 * more memory overhead
 * useful in only particular cases where forward and backward traversal are neccasary.
 *
 *good for undo and redo.
 *
 * */
public class DoublyLinkedList<T> implements List <T> {

    private int count;
    private Node head;
    private Node tail;

    public DoublyLinkedList(){
        count = 0;
        head = null;
        tail = null;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int getLength() {
        return count;
    }

    @Override
    public T get(int index) {
        //is valid??
        if (index < 0 || index >= count){
            throw new IndexOutOfBoundsException();
        }

        int i = 0;
        Node ptr = head;

        while (i < index && ptr.next != null){
            ptr= ptr.next;
            i++;
        }

        return ptr.data;
    }

    @Override
    public List prepend(T element) {
        Node n = new Node(element);

        if (isEmpty()){
            head = n;
            tail = n;
        } else {
            n.next = head;
            head = n;
            head.next.prev = head;
        }

        count++;

        return this;
    }

    @Override
    public List append(T element) {
        Node n = new Node(element);

        if (isEmpty()){
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail= n;
            tail.prev = n.prev;
        }

        count++;
        return this;
    }

    @Override
    public List insert(T element, int index) {
        if (count == 0){
            prepend(element);
        }

        if (index == count){
            prepend(element);
        }

        Node n = new Node(element);
        Node ptr = head;

        for (int i = 1; i < index; i++) {
            ptr = ptr.next;
            ptr.next.prev = ptr;
        }

        n.prev = ptr;
        n.next = ptr.next;
        ptr.next = n;
        n.next.prev = n;


        count++;

        return this;
    }

    @Override
    public List remove(int index) {
        Node ptr = head;

        if (index== 0){
            for (int i = index; i < count-1; i++) {
                ptr.prev= ptr.next;
                ptr.data = ptr.next.data;
                ptr = ptr.next;


                if (i == count-2){
                    ptr = tail;
                    break;
                }

            }
        }

        for (int i = 0; i < index; i++) {
            ptr = ptr.next;
        }



        for (int i = index; i < count-1; i++) {
            ptr.prev = ptr.next;
            ptr.data = ptr.next.data;
            ptr = ptr.next;

            if (i == count-2){
                ptr = tail;
                break;
            }

        }

        count--;

        return this;
    }

    @Override
    public int indexOf(T element) {
        return 0;
    }

    private class Node{

        private T data;
        private Node next;
        private Node prev;

        Node(T data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }


}
