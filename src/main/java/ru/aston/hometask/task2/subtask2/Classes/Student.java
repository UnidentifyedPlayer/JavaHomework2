package ru.aston.hometask.task2.subtask2.Classes;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Book> books;
    
    public Student(String name, List<Book> books) {
        this.name = name;
        this.books = new ArrayList<>();
        this.books.addAll(books);
    }

    public List<Book> getBooks() {
        return books;
    }


    public void addBooks(List<Book> books) {
        this.books.addAll(books);
    }

    public String toString() {
        return "Student\n-Name: " + name + "\n-Books: " + books + "";
    }

}
