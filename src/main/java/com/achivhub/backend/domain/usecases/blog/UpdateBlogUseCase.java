package com.achivhub.backend.domain.usecases.blog;

import com.achivhub.backend.domain.model.Blog;
import com.achivhub.backend.persistence.collection.BlogCollection;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class UpdateBlogUseCase {
    private final BlogCollection blogCollection;
    private final GetBlogByIdUseCase getBlogByIdUseCase;

    public Blog execute(String id, Blog blog) {
        Blog updatedBlog = getBlogByIdUseCase.execute(id);
        LocalDate time = updatedBlog.getCreatedAt();

        BeanUtils.copyProperties(blog, updatedBlog);

        updatedBlog.setUpdatedAt(LocalDate.now());
        updatedBlog.setCreatedAt(time);
        updatedBlog.setId(id);

        return blogCollection.save(updatedBlog);
    }
}
