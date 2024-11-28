package ru.solorepeat.Catsgram.controller;

import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import ru.solorepeat.Catsgram.model.Post;
import ru.solorepeat.Catsgram.service.PostService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static ru.solorepeat.Catsgram.Constants.DESCENDING_ORDER;
import static ru.solorepeat.Catsgram.Constants.SORTS;


@RestController
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> findAll(
            @RequestParam(value = "page", defaultValue = "0", required = false) Integer page,
            @RequestParam(value = "size", defaultValue = "10", required = false) Integer size,
            @RequestParam(value = "sort", defaultValue = DESCENDING_ORDER, required = false) String sort) {

        if (!SORTS.contains(sort) || page < 0 || size <= 0) {
            throw new IllegalArgumentException();
        }

        Integer from = page * size;
        return postService.findAll(size, from, sort);
    }

    @PostMapping(value = "/post")
    public Post createPost(@RequestBody Post post) {
        return postService.create(post);
    }

    @GetMapping("/post/{postId}")
    public Post findPostById(@PathVariable("postId") Integer postId) {
        return postService.findPostById(postId);
    }

    @GetMapping("/posts/search")
    public List<Post> searchPosts(@RequestParam String author,
                                  @RequestParam
                                  @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) {
        System.out.println("Ищем посты пользователя с именем " + author +
                " и опубликованные " + date);
        // теперь можно найти посты по следующему адресу:
        // .../posts/search?author=Bob&date=2020-12-31

        return new ArrayList<Post>();
    }
}
