package com.achivhub.backend.application.dtos.blog;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BlogRequest {
    private String title;

    private String content;

    private String author;

    private String[] tags;
}
