package com.automation.mpanamar.bookshelf;

public class Book {
    private int id;
    public BookInfo bookInfo;
    public PublisherInfo publisherInfo;

    public Book(int id, BookInfo bookInfo, PublisherInfo publisherInfo) {
        this.id = id;
        this.bookInfo = bookInfo;
        this.publisherInfo = publisherInfo;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BookInfo getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
    }

    public PublisherInfo getPublisherInfo() {
        return publisherInfo;
    }

    public void setPublisherInfo(PublisherInfo publisherInfo) {
        this.publisherInfo = publisherInfo;
    }

    @Override
    public String toString() {
        return "\nBook's name: " + bookInfo.getBookName() + "\nAuthor's name: " + bookInfo.getAuthorName() + "\nNumber of pages: " + getBookInfo().getPagesNumber() +
                "\nName of Publisher: " + publisherInfo.getPublisherName() + "\nPrice of the book: " + getPublisherInfo().getBookPrice() +
                "\nDate of publishing: " + getPublisherInfo().getPublishDate();
    }
}