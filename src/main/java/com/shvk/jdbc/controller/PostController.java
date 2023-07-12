package com.shvk.jdbc.controller;


import com.shvk.jdbc.model.Post;
import com.shvk.jdbc.repository.AuthorRepository;
import com.shvk.jdbc.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/posts")
public class PostController {

    private final PostRepository posts;
    private final AuthorRepository authors;

    public PostController(PostRepository postRepository, AuthorRepository authorRepository) {
        this.posts = postRepository;
        this.authors = authorRepository;
    }

    @GetMapping
    public Iterable<Post> findAll() {
        return posts.findAll();
    }

}
