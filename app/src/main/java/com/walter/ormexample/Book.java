package com.walter.ormexample;

import com.orm.SugarRecord;

/**
 * Created by walter on 5/27/17.
 */

public class Book extends SugarRecord {
    String title;
    String author;
    String year;

    public Book() {

    }

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }
}
