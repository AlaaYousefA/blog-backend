package com.achivhub.backend.domain.services;

import com.achivhub.backend.domain.model.Blog;
import com.achivhub.backend.persistence.collection.BlogCollection;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogsService {
    private final BlogCollection blogCollection;


//    public List<Blog> getAllBlogs() {
//        return blogCollection.getAllBlogs();
//    }

//    public Blog createBlog(Blog blog) {
//        blog.setCreatedAt(LocalDate.now());
//        blog.setUpdatedAt(LocalDate.now());
//
//        return blogCollection.save(blog);
//    }

//    public Blog getBlogById(String id) {
//        return blogCollection.getBlogById(id);
//    }

//    public Blog deleteBlog(String id) {
//        return blogCollection.deleteBlog(id);
//    }

//    public Blog updateBlog(String id, Blog blog) {
//        Blog updatedBlog = getBlogById(id);
//        LocalDate time = updatedBlog.getCreatedAt();
//
//        BeanUtils.copyProperties(blog, updatedBlog);
//
//        updatedBlog.setUpdatedAt(LocalDate.now());
//        updatedBlog.setCreatedAt(time);
//        updatedBlog.setId(id);
//
//        return blogCollection.save(updatedBlog);
//    }
}
