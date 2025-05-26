package ru.aston.hometask.task2.subtask2.Classes;

public class Book {

    public String title;

    public Integer year;

    public Integer pages;

    public Book(String title, Integer year, Integer pages) {
        this.title = title;
        this.year = year;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "\nBook [ " + title + ", y. " + year + ", pages. "+ pages + "]";
    }

    public int getPages(){
        return pages;
    }
}
