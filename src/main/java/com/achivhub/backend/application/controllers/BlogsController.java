package com.achivhub.backend.application.controllers;

import com.achivhub.backend.application.dtos.blog.BlogRequest;
import com.achivhub.backend.application.dtos.blog.BlogResponse;
import com.achivhub.backend.domain.mappers.BlogMapper;
import com.achivhub.backend.domain.model.Blog;
import com.achivhub.backend.domain.services.BlogsService;
import com.achivhub.backend.domain.usecases.blog.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/blogs")
public class BlogsController {
    private final BlogMapper blogMapper;

    private final CreateBlogUseCase createBlogUseCase;
    private final GetAllBlogsUseCase getAllBlogsUseCase;
    private final GetBlogByIdUseCase getBlogByIdUseCase;
    private final DeleteBlogUseCase deleteBlogUseCase;
    private final UpdateBlogUseCase updateBlogUseCase;


    @PostMapping
    public ResponseEntity<BlogResponse> createBlog(@RequestBody BlogRequest payload) {
        Blog blog = blogMapper.requestToModel(payload);
        return ResponseEntity.ok(
                blogMapper.modelToResponse(
                        createBlogUseCase.execute(blog)
                )
        );
    }

    @GetMapping
    public ResponseEntity<List<Blog>> getAllBlogs() {

        return ResponseEntity.ok(getAllBlogsUseCase.execute());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable String id) {
        return ResponseEntity.ok(getBlogByIdUseCase.execute(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BlogResponse> deleteBlog(@PathVariable String id) {
        return ResponseEntity.ok(
                blogMapper.modelToResponse(deleteBlogUseCase.execute(id))
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<BlogResponse> updateBlog(@PathVariable String id, @RequestBody BlogRequest payload) {
        Blog blog = blogMapper.requestToModel(payload);
        return ResponseEntity.ok(
                blogMapper.modelToResponse(updateBlogUseCase.execute(id, blog))
        );
    }


}
