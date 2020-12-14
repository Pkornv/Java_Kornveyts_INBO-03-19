package ru.mirea.lab1;

public class Book {
    private String author, name;
    private int pages;

    public Book(String a, String n, int p){
        author = a;
        name = n;
        pages = p;
    }

    public Book(String n, int p){
        author = "Tolstoy";
        name = n;
        pages = p;
    }

    public Book(String n){
        author = author = "Tolstoy";;
        name = n;
        pages = 543;
    }

    public Book(){
        author = author = "Tolstoy";;
        name = "Autobiography";
        pages = 543;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public String toString(){
        return this.author+", name "+this.name+", pages "+this.pages;
    }
}
