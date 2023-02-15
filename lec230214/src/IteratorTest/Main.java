package IteratorTest;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);

        Book book1 = new Book("문학동네");
        Book book2 = new Book("너무 한낮의 연애");
        Book book3 = new Book("늑대의 문장");
//
        bookShelf.appendBook(book1);
        bookShelf.appendBook(book2);
        bookShelf.appendBook(book3);
//
        System.out.println("현재 꽂혀있는 책 : " + bookShelf.getLength() + "권");
//
        Iterator it = bookShelf.createIterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getTitle());
        }

        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getTitle());
        }
    }

}
