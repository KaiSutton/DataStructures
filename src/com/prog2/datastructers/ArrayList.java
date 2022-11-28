package com.prog2.datastructers;

import com.prog2.interfaces.List;

/**
 * An array list uses an dynamic array to store elements
 * The only reason an Array list can behave like a list is because it implements the 'List' interface.
 * ArrayList uses less memory* than other lists and is faster to access.
 * they slower to change tho
 * @param <T>
 */
public class ArrayList<T> implements List<T> {

    private T[] list;
    private int count;

    public ArrayList(){
        this(20);
    }

    public ArrayList(int maxSize){
        count = 0;
        list = (T[])(new Object[maxSize]);
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
        //make sure index is valid
        if (index < 0 || index >= count){
            return null;
        }
        // pass back the T at index
        return list[index];
    }

    @Override
    public List prepend(T element) {

        // loop backwards over the array
        //move each element up by one index
        for (int i = count-1; i >= 0; i--) {
            list[i+1] = list[i];
        }

        // set elemnt in start yes
        list[0] = element;
        count++;

        return this;
    }

    @Override
    public List append(T element) {

        checkForGrowth();

        list[count] = element;
        count++;

        return this;

    }

    private void checkForGrowth() {
    }

    @Override
    public List insert(T element, int index) {
        checkForGrowth();

        if (count == index || index >= count){
            // TODO: out of bounds
        }

        for (int i = count -1; i >= index; i--) {
            list[i+1] = list[i];
        }

        list[index] = element;
        count++;
        return this;
    }

    @Override
    public List remove(int index) {
        if (index < 0 || index >= count){
            //out o bounds


        }



        for (int i = index; i < count-1; ++i) {
            list[i] = list[i+1];
        }

        --count;
        return this;
    }

    @Override
    public int indexOf(T element) {
        for (int i = 0; i < count; ++i) {
           if (list[i]== element){
               return i;
           }
        }

        return -1;
    }
}
