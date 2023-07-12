package com.shvk.jdbc.dto;

import com.shvk.jdbc.model.Author;
import com.shvk.jdbc.model.Post;

public record PostDetails(Post post, Author author) {
}
