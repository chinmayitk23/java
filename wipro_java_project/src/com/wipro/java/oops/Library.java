package com.wipro.java.oops;

// Abstraction: Using abstract classes and methods
abstract class LibraryItem {
    private String title;
    private String author;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Abstract method
    public abstract void displayInfo();
}

// Encapsulation: Data hiding through private fields and getter/setter methods
class Book extends LibraryItem {
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        super(title, author);
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    // Polymorphism: Method Overriding
    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + ISBN);
    }
}

class Magazine extends LibraryItem {
    private String issue;

    public Magazine(String title, String author, String issue) {
        super(title, author);
        this.issue = issue;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    // Polymorphism: Method Overriding
    @Override
    public void displayInfo() {
        System.out.println("Magazine Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Issue: " + issue);
    }
}

// Inheritance: Subclass Book and Magazine inherit from LibraryItem
public class Library {
    public static void main(String[] args) {
        // Creating objects
        LibraryItem book = new Book("Java Programming", "John Doe", "978-1234567890");
        LibraryItem magazine = new Magazine("Tech Today", "Jane Doe", "March 2025");

        // Display information (Demonstrating Polymorphism)
        book.displayInfo();
        System.out.println();
        magazine.displayInfo();
    }
}

