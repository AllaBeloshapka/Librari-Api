package com.example.libraryapi.service;

import com.example.libraryapi.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.libraryapi.model.Book;

import java.util.List;
import java.util.Optional;

/**
 * Service layer for {@link Book} operations.
 *
 * Encapsulates business logic and delegates persistence to {@link BookRepository}.
 */
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    /**
     * Returns all books.
     */
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    /**
     * Returns a book by id.
     */
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    /**
     * Creates a new book.
     */
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    /**
     * Deletes a book by id.
     */
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    /**
     * Returns all books that match the given author.
     */
    public List<Book> getBookByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    /**
     * Returns all books that match the given title.
     */
    public List<Book> getBookByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

}
