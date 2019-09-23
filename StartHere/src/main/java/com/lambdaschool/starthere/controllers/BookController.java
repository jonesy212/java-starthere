package com.lambdaschool.starthere.controllers;

import com.lambdaschool.starthere.models.Book;
import com.lambdaschool.starthere.models.ErrorDetail;
import com.lambdaschool.starthere.services.BookService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController
{
    private BookService bookService;

    @GetMapping(value = "/books/",
                produces = {"application/json"})

    public ResponseEntity<?> listAllBooks()
    {
        List<Book> myBooks = new ArrayList();
        bookService.findAll().iterator().forEachRemaining(myBooks::add);

        return new ResponseEntity<>(myBooks, null, HttpStatus.OK);

        {

        }

    @PostMapping(value ="/books/{bookid}/",
                 produces = {"application/json"})

    public ResponseEntity<?>


    @PutMapping(value ="/books/{id}",
                produces ={"application/json"},
                consumes = "{application/json"})
    public ResponseEntity<?>findById()
    {

    }

    @DeleteMapping(value="/books/{id}",
                   produces = "{application/json"})
}
