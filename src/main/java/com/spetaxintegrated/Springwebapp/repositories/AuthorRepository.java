package com.spetaxintegrated.Springwebapp.repositories;

import com.spetaxintegrated.Springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long
        > {
}
