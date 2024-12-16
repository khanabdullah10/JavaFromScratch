package com.gemini.book.service;

import com.gemini.book.entity.Book;
import com.gemini.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;


    public List<Book> getAllBook(){
        return bookRepository.findAll();
    }


    public void addBook(Book book){
         bookRepository.save(book);
    }

    public Optional<Book> updateBook(String isbn, Book book) {
        Optional<Book> existingBook = bookRepository.findByIsbn(isbn);
        if (existingBook.isPresent()) {
            book.setId(existingBook.get().getId());
            return Optional.of(bookRepository.save(book));
        } else {
            return Optional.empty();
        }
    }

    public Optional<Book> getBookByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }


    public void deleteBook(String isbn){
        Optional<Book> existingBook = bookRepository.findByIsbn(isbn);
        existingBook.ifPresent(b->bookRepository.delete(b));

    }




}
