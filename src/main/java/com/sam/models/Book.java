package com.sam.models;

import java.util.Date;

public class Book {

    public int Id;

    public String Name;
    public String AuthorName;
    public String PublisherName;
    public int NumberOfPages;
    public boolean inStock;
    public Date PublishedDate;

    @Override
    public String toString() {
        return new StringBuilder()
                .append("\nName: " + this.Name)
                .append("\nAuthorName: " + this.AuthorName)
                .append("\nPublisher: " + this.PublisherName)
                .append("\nNumber of pages: " + this.NumberOfPages)
                .append("\nPublished Date: " + this.PublishedDate.toString())
                .toString();

    }
}
