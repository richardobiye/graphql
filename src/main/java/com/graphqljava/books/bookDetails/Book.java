package com.graphqljava.books.bookDetails;

import java.util.Arrays;
import java.util.List;

public class Book {

    private String id;
    private String name;
    private int pageCount;
    private String subject;
    private String authorId;
    private int publicationYear;
    private String publisher;
    private String genre;

    public Book(String id, String name, int pageCount, String authorId, int publicationYear, String publisher, String genre) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.authorId = authorId;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.genre = genre;
    }

    private static List<Book> books = Arrays.asList(
            new Book("book1", "The Hitchhiker's Guide to the Galaxy", 180, "author1", 1979, "Pan Books", "Science Fiction"),
            new Book("book2", "Pride and Prejudice", 279, "author2", 1813, "T. Egerton", "Romance"),
            new Book("book3", "The Catcher in the Rye", 214, "author3", 1951, "Little, Brown and Company", "Coming-of-age")
    );

    public static Book getById(String id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }

    public String getAuthorId() {
        return authorId;
    }
}