package com.egorstrupinski.wt.task9_15;

import java.util.Comparator;

public class Book implements Comparable {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 17 * result + author.hashCode();
        result = 17 * result + price;
        return result;
    }

    @Override
    public String toString() {
        String ans = "Book (" +
                "title= " + title +
                ", author= " + author +
                ", price= " + price +
                ')';
        return ans;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Book)) return false;
        if (!this.getClass().equals(obj.getClass())) return false;

        if (price != ((Book) obj).price) return false;
        if (this.title.equals(((Book) obj).title)) return false;
        if (this.author.equals(((Book) obj).author)) return false;

        return true;
    }


    @Override
    public int compareTo(Object o) {
        Book book = (Book) o;
        return book.getIsbn() - this.isbn;
    }

    public Object clone() throws CloneNotSupportedException {
        Book book = (Book)super.clone();
        book.price = this.price;
        book.author = this.author;
        book.title = this.title;
        return book;
    }

    static class BookTitleComparator implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }

    static class BookAuthorComparator implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
    }

    static class BookPriceComparator implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return Integer.compare(o1.getPrice(), o2.getPrice());
        }
    }

}
