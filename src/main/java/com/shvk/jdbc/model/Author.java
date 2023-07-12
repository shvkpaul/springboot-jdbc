package com.shvk.jdbc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;

public record Author(
    @Id @JsonIgnore Integer id,
    String firstName,
    String lastName,
    String email,
    String username
) {
}
