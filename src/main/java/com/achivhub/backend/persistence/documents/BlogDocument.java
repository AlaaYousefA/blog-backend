package com.achivhub.backend.persistence.documents;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Document("blog")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class BlogDocument {

    private String id;

    @Field(name = "title")
    private String title;

    @Field(name = "content")
    private String content;

    @Field(name = "author")
    private String author;

    @Field(name = "tags")
    private String[] tags;

    @Field(name = "created_at")
    private LocalDate createdAt;

    @Field(name = "updated_at")
    private LocalDate updatedAt;
}
