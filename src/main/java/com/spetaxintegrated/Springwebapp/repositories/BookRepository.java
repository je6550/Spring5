package com.spetaxintegrated.Springwebapp.repositories;

import com.spetaxintegrated.Springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
