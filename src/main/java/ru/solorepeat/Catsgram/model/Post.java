package ru.solorepeat.Catsgram.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class Post {
    Integer id;
    private final String author;
    private final Instant creationDate = Instant.now();
    private String description;
    private String photoUrl;

    public Post(Integer id, String author, String description, String photoUrl) {
        this.id = id;
        this.author = author;
        this.description = description;
        this.photoUrl = photoUrl;
    }

}
