package com.achivhub.backend.domain.usecases.blog;

import com.achivhub.backend.domain.mappers.BlogMapper;
import com.achivhub.backend.domain.model.Blog;
import com.achivhub.backend.persistence.collection.BlogCollection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetAllBlogsUseCase {
    private final BlogCollection blogCollection;

    public List<Blog> execute() {
        return blogCollection.getAllBlogs();
    }

}
