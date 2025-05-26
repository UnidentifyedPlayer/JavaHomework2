package ru.aston.hometask.task2.subtask1.Classes;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class SimpleArrayList<E> {

    private E[] elements;

    private int size;

    public SimpleArrayList(int capacity) {
        this.size = 0;
        elements = (E[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean add(E element) {
        if (size == elements.length) {
            E[] newElements = (E[]) new Object[size * 2 + 1];
            System.arraycopy(elements,0, newElements,0, size);
            elements = newElements;
        }
        elements[size++] = element;
        return true;
    }

    public E get(int index) {
        return elements[index];
    }

    public boolean remove(int index) {
        E element = elements[index];
        if(element == null) return false;
        elements[index] = null;
        for(int i = index; i < size-1; i++){
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return true;
    }

    public boolean addAll(Collection<? extends E> c) {
        try {
            for (Iterator<? extends E> name = c.iterator();
                 name.hasNext();){
                this.add(name.next());
            }
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }
    public String toString() {
        return Arrays.toString(elements);
    }
}
