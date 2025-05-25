package ru.aston.hometask.task2.subtask1;


import ru.aston.hometask.task2.subtask1.Classes.SimpleArrayList;
import ru.aston.hometask.task2.subtask1.Classes.SimpleHashSet;

import java.lang.System;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n Testing SimpleHashSet\n");
        SimpleHashSet<Integer> set = new SimpleHashSet<Integer>();
        for (int i = 1; i <= 5; i++) {
            set.add(i);
        }
        System.out.println(set.contains(1)); //should be true
        System.out.println(set.add(1)); //should be false
        System.out.println(set.add(45345346)); //should be true
        System.out.println(set.add(45345346)); //should be false
        System.out.println(set.contains(45345346)); //should be true
        System.out.println(set.remove(1)); //should be true
        System.out.println(set.contains(1)); //should be false
        System.out.println(set.size());
        System.out.println(set);

        System.out.printf("Testing SimpleArrayList\n");
        SimpleArrayList<Integer> list = new SimpleArrayList<Integer>(5);
        System.out.println(list.size());
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println(list.size());
        System.out.println(list.add(34));
        System.out.println(list.remove(4));
        System.out.println(list.get(4));
        System.out.println(list);

//        var count = (1 << 15);
//        var buckets = new ArrayList<Integer>(count);
//        var startDate = System.currentTimeMillis();
//
//        for (int i = 0; i < count; i++) {
//            buckets.add(0);
//        }
//
//        var endDate = System.currentTimeMillis();
//        System.out.println(buckets.size());
//        System.out.println(endDate - startDate);
    }
}