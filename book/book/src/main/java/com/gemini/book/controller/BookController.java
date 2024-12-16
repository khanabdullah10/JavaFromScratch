package com.gemini.book.controller;

import com.gemini.book.entity.Book;
import com.gemini.book.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/fetchAll")
    public List<Book> getAll(){
        return bookService.getAllBook();
    }

    @PostMapping("/add")
    public String addBook(@RequestBody @Valid Book book){
        bookService.addBook(book);
        return "Added successfully !";
    }

    @PutMapping("/{isbn}")
    public String updateBook(@PathVariable String isbn , @Valid @RequestBody Book book){
        bookService.updateBook(isbn,book);
        return "Successfully updated !";

    }

    @DeleteMapping("/{isbn}")
    public String deleteBook(@PathVariable String isbn){
        bookService.deleteBook(isbn);
        return "Deleted successfully !";
    }


    @GetMapping("/{isbn}")
    public Optional<Book> getByIsbn(@PathVariable String isbn){
        return bookService.getBookByIsbn(isbn);
    }

}
