package com.shvk.jdbc.repository;

import com.shvk.jdbc.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {

}
