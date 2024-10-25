package com.achivhub.backend.persistence.adapter;

import com.achivhub.backend.application.dtos.blog.BlogResponse;
import com.achivhub.backend.domain.mappers.BlogMapper;
import com.achivhub.backend.domain.model.Blog;
import com.achivhub.backend.persistence.collection.BlogCollection;
import com.achivhub.backend.persistence.database.BlogMongoCollection;
import com.achivhub.backend.persistence.documents.BlogDocument;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BlogAdapter implements BlogCollection {
    private final BlogMongoCollection blogMongoCollection;
    private final BlogMapper blogMapper;

    @Override
    public List<Blog> getAllBlogs() {

        return blogMongoCollection
                .findAll()
                .stream()
                .map(blogMapper::documentToModel)
                .toList();
    }

    @Override
    public Blog save(Blog blog) {
        BlogDocument document = blogMapper.modelToDocument(blog);

        return  blogMapper.documentToModel(blogMongoCollection.save(document)) ;
    }

    @Override
    public Blog getBlogById(String id) {

        BlogDocument document = blogMongoCollection.findById(id)
                .orElseThrow(() -> new RuntimeException("id not exist"));
        return blogMapper.documentToModel(document);
    }

    @Override
    public Blog deleteBlog(String id) {
        Blog blog = getBlogById(id);
        blogMongoCollection.deleteById(id);
        return blog;
    }
}
