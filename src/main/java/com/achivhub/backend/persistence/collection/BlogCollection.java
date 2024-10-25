package com.achivhub.backend.persistence.collection;

import com.achivhub.backend.domain.model.Blog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogCollection {
    List<Blog> getAllBlogs();

    Blog save(Blog blog);

    Blog getBlogById(String id);

    Blog deleteBlog(String id);
}
