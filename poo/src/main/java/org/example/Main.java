package org.example;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("Armand");
        myBook.setTitle("Programming");
        myBook.setIsbn("GT6FR5");

        myBook.displayInfo();
        Ebook myEbook = new Ebook("Carole");
    }
}