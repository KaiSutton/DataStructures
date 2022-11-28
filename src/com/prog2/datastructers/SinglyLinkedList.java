package com.prog2.datastructers;


import com.prog2.interfaces.List;

/**
 * In a singly linked list, nodes will only know where the next node in the chain is
 * sometimes preferanb;e bc less memory oberhead as compare to doubky linked list
 *
 * truely dynamic size
 * easy to insert/delete
 * fast at inserting and deleting
 *
 * random access is not allowed
 * elemenrs must be accessed sequntially
 * extra memory space must be used for a pointer to each item in list
 * not cache friendly
 */
public class SinglyLinkedList<T> implements List<T> {

    private int count;
    private Node head;
    private Node tail;

    public SinglyLinkedList(){
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
        }

        n.next = ptr.next;
        ptr.next = n;

        count++;

        return this;
    }

    @Override
    public List remove(int index) {

        Node ptr = head;

        if (index== 0){
            for (int i = index; i < count-1; i++) {
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
        //imfo
        private T data;

        //nect node in chain
        private Node next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

}
