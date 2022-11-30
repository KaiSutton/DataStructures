package com.prog2.stack;


/**
 * a first in last out (FILO) or last in first out LIFE data structure.
 *
 *
 * */
public class Stack<T> {

   static final int MAX = 1000;
   private int top;
   T[] arr;

   public Stack(){
       // when the array is empty thw top is not valid
       top = -1;

       // al indicies are 0-999
       arr  =(T[]) new Object[MAX];

   }

   public boolean isEmpty(){
       return top < 0;
   }

   private boolean isFull(){
       return top >= MAX-1;
   }

   public void push(T item){

       if(isFull()){
           System.out.println("bad");
           return;
       }

       arr[++top] = item;
   }

   public T pop(){

       if (isEmpty()){
           System.out.println("bad");
           return null;
       }

       return arr[top--];
   }

   public T peek(){

       if (isEmpty()){
           System.out.println("bad");
           return null;
       }

       return arr[top];

   }


}
