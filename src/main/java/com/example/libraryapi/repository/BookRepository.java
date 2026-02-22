package com.example.libraryapi.repository;

import com.example.libraryapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    // Spring Data автоматически создаст методы:
// - findAll() — получить все книги
// - findById(id) — найти книгу по ID
// - save(book) — сохранить книгу
// - deleteById(id) — удалить книгу

}
