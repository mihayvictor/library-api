package io.github.mihayvictor.library_api.book;

import io.github.mihayvictor.library_api.book.dto.BookCreateRequest;
import io.github.mihayvictor.library_api.book.dto.BookResponse;
import io.github.mihayvictor.library_api.book.entity.Book;

import java.util.List;

public interface BookService {

    BookResponse create(BookCreateRequest request);

    List<Book>findAll();
}
