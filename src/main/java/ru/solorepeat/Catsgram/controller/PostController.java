package ru.solorepeat.Catsgram.controller;

import org.springframework.web.bind.annotation.*;
import ru.solorepeat.Catsgram.exceptions.IncorrectParameterException;
import ru.solorepeat.Catsgram.model.Post;
import ru.solorepeat.Catsgram.service.PostService;

import java.util.List;

import static ru.solorepeat.Catsgram.Constants.DESCENDING_ORDER;
import static ru.solorepeat.Catsgram.Constants.SORTS;


@RestController
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> findAll(
            @RequestParam(defaultValue = "0", required = false) Integer page,
            @RequestParam(defaultValue = "10", required = false) Integer size,
            @RequestParam(defaultValue = DESCENDING_ORDER, required = false) String sort
    ) {
        if (!SORTS.contains(sort)) {
            throw new IncorrectParameterException("sort");
        }
        if (page < 0) {
            throw new IncorrectParameterException("page");
        }
        if (size <= 0) {
            throw new IncorrectParameterException("size");
        }
        Integer from = page * size;
        return postService.findAll(size, from, sort);
    }

    @PostMapping(value = "/post")
    public Post create(@RequestBody Post post) {
        return postService.create(post);
    }

    @GetMapping("/post/{postId}")
    public Post findPost(@PathVariable("postId") Integer postId) {
        return postService.findPostById(postId);
    }
}