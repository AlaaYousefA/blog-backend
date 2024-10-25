package com.achivhub.backend.domain.usecases.blog;

import com.achivhub.backend.domain.model.Blog;
import com.achivhub.backend.persistence.collection.BlogCollection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class CreateBlogUseCase {
    private final BlogCollection blogCollection;

    public Blog execute(Blog blog) {
        blog.setCreatedAt(LocalDate.now());
        blog.setUpdatedAt(LocalDate.now());

        return blogCollection.save(blog);
    }
}
