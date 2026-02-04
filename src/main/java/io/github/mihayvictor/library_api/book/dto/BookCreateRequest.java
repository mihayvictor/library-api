package io.github.mihayvictor.library_api.book.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record BookCreateRequest(
      @NotBlank String title,
      @NotBlank String author,
      @Min(1) int pages
) {}
