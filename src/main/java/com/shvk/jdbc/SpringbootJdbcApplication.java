package com.shvk.jdbc;

import com.shvk.jdbc.model.Post;
import com.shvk.jdbc.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpringbootJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbcApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PostRepository postRepository){
		return args -> {
			postRepository.save(new Post("Hello world","Welcome", LocalDateTime.now()));
		};
	}
}
