package com.automation.mpanamar.bookshelf;

public class BookInfo {
    private String bookName;
    private String authorName;
    private int pagesNumber;

    public BookInfo(String bookName, String authorName, int pagesNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pagesNumber = pagesNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", pagesNumber=" + pagesNumber +
                '}';
    }
}
