package com.automation.mpanamar.bookshelf;



public class BookUtils {


    public static void getBookByDate(Book[] books, int PublishDate) {
        for (Book book : books) {
            if (book.getPublisherInfo().getPublishDate()>PublishDate) {
                System.out.println(book);
            }
        }
    }
    public static void getBookByAuthor (Book[] books, String authorName) {
        for (Book book : books) {
            if (book.getBookInfo().getAuthorName()=="J.K. Rowling") {
                System.out.println(book);
            }
        }
    }
    public static void getBookByPublisher (Book[] books, String publisherName) {
        for (Book book : books) {
            if (book.getPublisherInfo().getPublisherName()==publisherName) {
                System.out.println(book);
            }
        }
    }
}
