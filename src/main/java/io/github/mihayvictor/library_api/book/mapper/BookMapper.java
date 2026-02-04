package io.github.mihayvictor.library_api.book.mapper;

import io.github.mihayvictor.library_api.book.dto.BookCreateRequest;
import io.github.mihayvictor.library_api.book.dto.BookResponse;
import io.github.mihayvictor.library_api.book.entity.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {

    Book toEntity(BookCreateRequest request);
    BookResponse toResponse(Book book);
}
