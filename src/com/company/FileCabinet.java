package com.company;

import java.util.Date;

public class FileCabinet {
    String title;
    String author;
    int publishingYear;
    String publishingHouse;
    double price;
    String status;
    String dateIssued;

    public FileCabinet(){}

    public FileCabinet(final String title,final String author,final int publishingYear,final String publishingHouse, final double price,final String status,final String dateIssued){
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.publishingHouse = publishingHouse;
        this.price = price;
        this.status = status;
        this.dateIssued = dateIssued;
    }

}
