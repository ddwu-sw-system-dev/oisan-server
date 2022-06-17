package com.example.oisan.controller;

import com.example.oisan.domain.Auction;
import com.example.oisan.domain.Customer;
import com.example.oisan.domain.Post;
import com.example.oisan.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/post/new")
    public Post createPost(@RequestBody PostCommand postCom) {
        Post post = postService.createPost(postCom);
        return post;
    }

    @GetMapping("/post/list")
    public List<Post> getPostList() {
        List<Post> posts = postService.findPosts();
        return posts;
    }

    @GetMapping("/post/list/{customerId}")
    public List<Post> getPostListByCustomerId(@PathVariable("customerId") int customerId) {
        List<Post> posts = postService.findPostByCustomerId(customerId);
        return posts;
    }

    @GetMapping("/post")
    public Post getPost(@RequestParam("postId") int postId) {
        Post post = postService.findPost(postId).get();
        return post;
    }

    @GetMapping("/post/edit")
    public Post editPost(@RequestParam("postId") int postId) {
        Post post = postService.findPost(postId).get();
        return post;
    }

    @PutMapping("/post/edit")
    public String updatePost(@RequestBody PostCommand postCom) {
        postService.updatePost(postCom);
        return "redirect:/";
    }

    @DeleteMapping("/post/delete")
    public String deletePost(@RequestParam("postId") int postId) {
        postService.deletePost(postId);
        return "redirect:/";
    }
}
