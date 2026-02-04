package io.github.mihayvictor.library_api.book.dto;

import org.springframework.data.annotation.Id;

public record BookResponse(
        @Id
        String id,
        String title,
        String author,
        int pages
) {}
