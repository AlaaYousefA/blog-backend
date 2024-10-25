package com.achivhub.backend.domain.mappers;

import com.achivhub.backend.application.dtos.blog.BlogRequest;
import com.achivhub.backend.application.dtos.blog.BlogResponse;
import com.achivhub.backend.domain.model.Blog;
import com.achivhub.backend.persistence.documents.BlogDocument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BlogMapper {
    Blog requestToModel(BlogRequest blog);
    BlogResponse modelToResponse(Blog blog);

    Blog documentToModel(BlogDocument blogDocument);
    BlogDocument modelToDocument(Blog blog);
}
