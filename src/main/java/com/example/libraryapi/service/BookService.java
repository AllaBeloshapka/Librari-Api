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
    // Получить все книги
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    // Найти книгу по ID
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }
    // Создать новую книгу
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
    // Удалить книгу
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
    //Найти книгу по автору
    public List<Book> getBookByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }
    //Найти книгу по названию
    public List<Book> getBookByTitle(String title) {
        return bookRepository.findByTitle(title);
    }
}
