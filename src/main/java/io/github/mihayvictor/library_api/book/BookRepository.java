package io.github.mihayvictor.library_api.book;

import io.github.mihayvictor.library_api.book.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
