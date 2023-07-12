package com.shvk.jdbc.controller;


import com.shvk.jdbc.dto.PostDetails;
import com.shvk.jdbc.model.Post;
import com.shvk.jdbc.repository.AuthorRepository;
import com.shvk.jdbc.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/{id}")
    public Optional<Post> findById(@PathVariable("id") Integer id) {
        return posts.findById(id);
    }

    @GetMapping("/{id}/details")
    public PostDetails getPostDetails(@PathVariable Integer id) {
        Post post = posts.findById(id).orElse(null);
        return new PostDetails(post,authors.findById(post.getAuthor().getId()).get());
    }
}
