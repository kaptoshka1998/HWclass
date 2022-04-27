package ru.skypro;

public class Main {


    public static void main(String[] args) {
        Author firstAuthor = new Author("Albert", "Comuy");
        Book firstBook = new Book("In vino veritas", 1998, firstAuthor);
        System.out.println(firstBook);
        firstBook.setYear(1997);
        System.out.println("firstBook.getYear() = " + firstBook.getYear());
        Author secondAuthor = new Author("Ludvig Van","Bethoven");
        Book secondBook = new Book("Crazy frog", 2015, secondAuthor);
        System.out.println(secondBook);

        //Часть 2
        System.out.println("Автор с таким именем уже существует? " + firstAuthor.equals(secondAuthor));
        System.out.println("Такая книга уже существует? " + firstBook.equals(secondBook));

    }
}
