package com.shvk.jdbc.repository;

import com.shvk.jdbc.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Integer> {
}
