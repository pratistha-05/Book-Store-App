package com.example.mystore;

public class User {
    String bookName,author,genre;
    int price;

    public User(String bookName, String aut, String genre, int price) {
        this.bookName = bookName;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAut(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
