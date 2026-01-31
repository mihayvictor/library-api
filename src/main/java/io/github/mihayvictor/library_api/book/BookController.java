package io.github.mihayvictor.library_api.book;

import io.github.mihayvictor.library_api.book.entity.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<Book>> findAll(){
        Book narnia = new Book(1L, "Nárnia", "C.S. Lewis",300);
        Book abolicao = new Book(2L, "Abolição do homem", "C.S. Lewis", 120);
        List<Book> list = new ArrayList<>();
        list.addAll(Arrays.asList(narnia, abolicao));
        return ResponseEntity.ok(list);
    }
}
