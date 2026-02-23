package com.example.libraryapi.repository;

import com.example.libraryapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * JPA repository for {@link Book} entities.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    /**
     * Finds books by exact author match.
     */
    List<Book> findByAuthor(String author);

    /**
     * Finds books by exact title match.
     */
    List<Book> findByTitle(String title);

}


