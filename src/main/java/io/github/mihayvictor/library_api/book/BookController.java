package io.github.mihayvictor.library_api.book;

import io.github.mihayvictor.library_api.book.dto.BookCreateRequest;
import io.github.mihayvictor.library_api.book.dto.BookResponse;
import io.github.mihayvictor.library_api.book.entity.Book;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Book>> findAll(){
        List<Book> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public  ResponseEntity<Book> findById(@PathVariable @Valid String id){
        Book book = service.findById(id);
        return ResponseEntity.ok(book);
    }

    @PostMapping
    public ResponseEntity<BookResponse> create(@RequestBody @Valid BookCreateRequest request){
        return  ResponseEntity.status(HttpStatus.CREATED).body(service.create(request));
    }








}
