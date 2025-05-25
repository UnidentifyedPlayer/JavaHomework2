package ru.aston.hometask.task2.subtask1.Classes;

import java.util.ArrayList;
import java.util.LinkedList;

public class SimpleHashSet<E> {

    private ArrayList<LinkedList<E>> buckets;
    private int size;

    public SimpleHashSet() {
        size = 0;
        var count = (1 << 15);
        buckets = new ArrayList<LinkedList<E>>(count);
        for (int i = 0; i < count; i++) {
            buckets.add(new LinkedList<E>());
        }
    }


    private int hash(E object){
        return ((object.hashCode()*1031237) & (1<<20) - 1)>>5;
    }

    private boolean checkBucket(LinkedList<E> bucket, E object){
        var objectHash = hash(object);
        if(bucket.isEmpty()) return false;
        for(E e : bucket){
            if(objectHash == hash(e) && object.equals(e)){
                return true;
            }
        }
        return false;
    }

    private LinkedList<E> getBucket(E object){
        return buckets.get(hash(object));
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public Object[] toArray(){
        return buckets.stream().flatMap(LinkedList::stream).toArray();
    }

    public String toString(){
        return buckets.stream().flatMap(LinkedList::stream).toList().toString();
    }

    public boolean add(E object){
        var list = getBucket(object);
        if(checkBucket(list, object)){
            return false;
        }
        list.addLast(object);
        size++;
        return true;
    }

    public boolean remove(E object){
        var list = getBucket(object);
        if(!checkBucket(list, object)){
            return false;
        }
        list.remove(object);
        size--;
        return true;
    }

    public boolean contains(E object){
        var list = getBucket(object);
        return checkBucket(list, object);
    }
}
