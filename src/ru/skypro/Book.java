package ru.skypro;

import java.util.Objects;

public class Book {
    private String name;
    private int year;
    private Author author;

    public Book(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "'" + this.name + "'" + " " + this.author + " " + this.year;
    }
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        //я тут немного облажалась, поэтому исправляю
        if (this.getClass() != other.getClass() || other.getClass() == null) {
            return false;
        }
        Book b2 = (Book) other;
        return (name.equals(b2.name) && author.equals(b2.author));
    }
    public int hashCode() {
        return Objects.hash(name, year, author);
    }

}
