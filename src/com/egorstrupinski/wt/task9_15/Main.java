package com.egorstrupinski.wt.task9_15;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBallInside(new Ball(2, "blue"));
        basket.addBallInside(new Ball(3, "red"));
        basket.addBallInside(new Ball(4, "blue"));
        basket.addBallInside(new Ball(5, "green"));

        System.out.println(basket.findWeight());
        System.out.println(basket.findBlueBallsAmount());



        //Task 15
        Comparator<Book> comparator = new Book.BookTitleComparator();
        Comparator<Book> comparator2 = new Book.BookTitleComparator().thenComparing(new Book.BookAuthorComparator());
        Comparator<Book> comparator3 = new Book.BookAuthorComparator().thenComparing(new Book.BookTitleComparator());
        Comparator<Book> comparator4 = new Book.BookAuthorComparator().thenComparing(new Book.BookTitleComparator()).thenComparing(new Book.BookPriceComparator());


    }
}
