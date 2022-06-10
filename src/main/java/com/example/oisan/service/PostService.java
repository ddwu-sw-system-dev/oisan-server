package com.example.oisan.service;

import com.example.oisan.controller.PostCommand;
import com.example.oisan.domain.Post;
import com.example.oisan.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PostService {

    private PostRepository postRepository;

    public PostService() {}

    @Autowired
    public void setPostRepository(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post save(PostCommand postCom, int customerId) {
        Post post = new Post(customerId, postCom.getCategId(), new Date(), postCom.getTitle(),
                postCom.getDesc(), postCom.getImageUrl(), postCom.getWidth(), postCom.getHeight(), postCom.getDepth(), 1);
        return postRepository.save(post);
    }

    public List<Post> findPosts() {
        return postRepository.findAll();
    }

    public Optional<Post> findPost(int postId) {
        return postRepository.findById(postId);
    }

    public void deletePost(int postId) {
        postRepository.deleteById(postId);
    }

}
