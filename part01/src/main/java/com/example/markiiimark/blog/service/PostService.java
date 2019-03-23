package com.example.markiiimark.blog.service;

import com.example.markiiimark.blog.domain.Post;
import com.example.markiiimark.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public void insertPost(Post post) {
        postRepository.save(post);
    }

}
