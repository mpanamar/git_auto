package com.automation.mpanamar.bookshelf;


public class BookUtils {

    public static Book[] getBooks() {
        return new Book[]{
                new Book(1, new BookInfo("Harry Potter", "J.K. Rowling", 500),
                        new PublisherInfo("London Books", 24.99, 2002, Cover.SOLID)),
                new Book(2, new BookInfo("Normal People", "Sally Rooney", 850),
                        new PublisherInfo("NY", 35.00, 2018, Cover.SOFT)),
                new Book(3, new BookInfo("Normal A Visit from The Goon Squad", "Jennifer Egan", 384),
                        new PublisherInfo("London Books", 18.30, 2011, Cover.SOFT)),
                new Book(4, new BookInfo("The Noonday Demon", "Andrew Solomon", 450),
                        new PublisherInfo("That Publisher", 25.90, 2001, Cover.SOLID)),
                new Book(5, new BookInfo("Tenth of December", "George Saunders", 270),
                        new PublisherInfo("That Publisher", 44.00, 2013, Cover.SOFT)),
                new Book(6, new BookInfo("Life After Life", "Kate Atkinson", 270),
                        new PublisherInfo("NY", 75.00, 2013, Cover.SOFT)),
                new Book(7, new BookInfo("The Curious Incident of the Dog in the Night‑Time", "Mark Haddon", 390),
                        new PublisherInfo("London Books", 19.90, 2003, Cover.SOLID)),
                new Book(8, new BookInfo("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 530),
                        new PublisherInfo("London Books", 27.99, 2003, Cover.SOLID)),
        };
    }

    public static void getBookByDate(Book[] books, int PublishDate) {
        for (Book book : books) {
            if (book.getPublisherInfo().getPublishDate() > PublishDate) {
                System.out.println(book);
            }
        }
    }

    public static void getBookByAuthor(Book[] books, String authorName) {
        for (Book book : books) {
            if (book.getBookInfo().getAuthorName() == "J.K. Rowling") {
                System.out.println(book);
            }
        }
    }

    public static void getBookByPublisher(Book[] books, String publisherName) {
        for (Book book : books) {
            if (book.getPublisherInfo().getPublisherName() == publisherName) {
                System.out.println(book);
            }
        }
    }
}
