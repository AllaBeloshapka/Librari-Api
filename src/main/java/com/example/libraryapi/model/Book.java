package com.example.libraryapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

/**
 * Book entity persisted in the {@code books} table.
 */
@Entity
@Table(name = "books")

public class Book {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is required")
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "Author is required")
    @Column(nullable = false)
    private String author;

    @Column(name = "publish_year")
    private Integer year;

    @Column(name = "description")
    private String contents;

    /**
     * Default constructor (required by JPA).
     */
    public Book() {
    }

    /**
     * Convenience constructor.
     */
    public Book(String title, String author, Integer year, String contents) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.contents = contents;
    }

    // Getters and setters

    public String getContents() {
        return contents;
    }

    public void setContents(String text) {
        this.contents = contents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


}
