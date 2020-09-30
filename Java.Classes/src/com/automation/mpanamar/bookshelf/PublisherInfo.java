package com.automation.mpanamar.bookshelf;

enum Cover {
    SOFT,
    SOLID
}

public class PublisherInfo {
    private String publisherName;
    private double bookPrice;
    private int publishDate;
    private Cover coverName;

    public PublisherInfo(String publisherName, double bookPrice, int publishDate, Cover coverName) {
        this.publisherName = publisherName;
        this.bookPrice = bookPrice;
        this.publishDate = publishDate;
        this.coverName = coverName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public Cover getCoverName() {
        return coverName;
    }

    public void setCoverName(Cover coverName) {
        this.coverName = coverName;
    }

    @Override
    public String toString() {
        return "PublisherInfo{" +
                "publisherName='" + publisherName + '\'' +
                ", bookPrice=" + bookPrice +
                ", publishDate=" + publishDate +
                ", coverName=" + coverName +
                '}';
    }


}
