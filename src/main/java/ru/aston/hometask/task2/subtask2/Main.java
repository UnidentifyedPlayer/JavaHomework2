package ru.aston.hometask.task2.subtask2;


import ru.aston.hometask.task2.subtask2.Classes.Book;
import ru.aston.hometask.task2.subtask2.Classes.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Calculus", 2005, 208));
        books.add(new Book("Philosophy", 2001, 465));
        books.add(new Book("Microbiology", 1983, 533));
        books.add(new Book("Virology", 1994, 644));
        books.add(new Book("Molecular Biology", 1950, 296));
        books.add(new Book("Radiobiology", 1964, 214));
        books.add(new Book("Thermodynamics", 2015, 347));
        books.add(new Book("Mechanics", 2007, 226));
        books.add(new Book("Biophysics", 2010, 838));
        books.add(new Book("Applied mathematics", 1998, 466));
        books.add(new Book("Category theory ", 2001, 272));
        books.add(new Book("Group theory", 2002, 521));

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("George",
                Arrays.asList(books.get(1), books.get(4), books.get(9), books.get(2) ,books.get(7), books.get(0))));
        students.add(new Student("Jessica",
                Arrays.asList(books.get(11), books.get(6), books.get(5), books.get(2) ,books.get(8))));
        students.add(new Student("Maria",
                Arrays.asList(books.get(11), books.get(6), books.get(5), books.get(2) ,books.get(8))));
        students.add(new Student("Rudolf",
                Arrays.asList(books.get(8), books.get(2), books.get(5), books.get(3) ,books.get(9))));


        var result = students.stream().peek(student -> {System.out.println(student.toString());}).
                map(Student::getBooks).flatMap(List::stream).sorted(Comparator.comparing(Book::getPages)).distinct().
                filter(book -> book.year > 2000).limit(3).map(book->book.year).findFirst().orElse(null);
        if(result != null)
            System.out.println("Year of the book found: " + result);
        else
            System.out.println("No book found");

    }
}