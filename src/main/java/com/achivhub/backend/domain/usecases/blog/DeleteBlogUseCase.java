package com.achivhub.backend.domain.usecases.blog;

import com.achivhub.backend.domain.model.Blog;
import com.achivhub.backend.persistence.collection.BlogCollection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeleteBlogUseCase {
    private final BlogCollection blogCollection;

    public Blog execute(String blogId) {
        return blogCollection.deleteBlog(blogId);
    }
}
