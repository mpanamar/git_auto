package com.automation.mpanamar.bookshelf;

import static com.automation.mpanamar.bookshelf.BookUtils.getBooks;

public class BookMain {

    public static void main(String[] args) {
        System.out.println("\nBooks published after 2000:");
        BookUtils.getBookByDate(getBooks(), 2000);
        System.out.println("\nBooks from J.K. Rowling");
        BookUtils.getBookByAuthor(getBooks(), "J.K. Rowling:");
        System.out.println("\nBooks from That Publisher:");
        BookUtils.getBookByPublisher(getBooks(), "That Publisher");

    }
}
