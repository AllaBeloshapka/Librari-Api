package com.example.libraryapi.service;

import com.example.libraryapi.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.libraryapi.model.Book;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Find a book by ID
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    // Create a new book
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    // Delete a book by ID
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    // Find books by author
    public List<Book> getBookByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    // Find books by title
    public List<Book> getBookByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

}
