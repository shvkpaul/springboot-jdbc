package com.shvk.jdbc;

import com.shvk.jdbc.model.Author;
import com.shvk.jdbc.model.Post;
import com.shvk.jdbc.repository.AuthorRepository;
import com.shvk.jdbc.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpringbootJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbcApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PostRepository postRepository, AuthorRepository authorRepository){
		return args -> {
			AggregateReference<Author, Integer> author = AggregateReference
				.to(authorRepository.save(
					new Author(null, "shouvik", "paul",
								"shvkpaul@gmail.com", "shvk")).id());
			postRepository.save(
					new Post("Hello world","Welcome", LocalDateTime.now(),author));
		};
	}
}
