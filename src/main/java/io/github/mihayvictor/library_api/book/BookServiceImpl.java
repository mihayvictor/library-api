package io.github.mihayvictor.library_api.book;

import io.github.mihayvictor.library_api.book.dto.BookCreateRequest;
import io.github.mihayvictor.library_api.book.dto.BookResponse;
import io.github.mihayvictor.library_api.book.entity.Book;
import io.github.mihayvictor.library_api.book.mapper.BookMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository repository;
    private final BookMapper mapper;

    public BookServiceImpl(BookRepository repository, BookMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public BookResponse create(BookCreateRequest request) {
        Book book = mapper.toEntity(request);
        return mapper.toResponse(repository.save(book));
    }

    @Override
    public List<Book> findAll() {
        return repository.findAll();
    }

}
