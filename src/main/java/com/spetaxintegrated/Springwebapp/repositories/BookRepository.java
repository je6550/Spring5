package com.spetaxintegrated.Springwebapp.repositories;

import com.spetaxintegrated.Springwebapp.domain.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {
}
