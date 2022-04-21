package ru.skypro;

public class Main {


    public static void main(String[] args) {
        Author firstAuthor = new Author("Albert", "Comuy");
        Book firstBook = new Book("In vino veritas", 1998, firstAuthor);
        System.out.println("'" + firstBook.getName() + "'" + " " + firstBook.getAuthor().firstName + " " + firstBook.getAuthor().secondName+ " " + firstBook.getYear());
        firstBook.setYear(1997);
        System.out.println("firstBook.getYear() = " + firstBook.getYear());
        Author secondAuthor = new Author("Ludvig Van","Bethoven");
        Book secondBook = new Book("Crazy frog", 2015, secondAuthor);
        System.out.println("'" + secondBook.getName() + "'" + " " + secondBook.getAuthor().firstName + " " + secondBook.getAuthor().secondName+ " " + secondBook.getYear());

    }
}
