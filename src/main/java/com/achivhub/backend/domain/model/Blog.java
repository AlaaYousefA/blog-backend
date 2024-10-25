package com.achivhub.backend.domain.model;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Blog {

    private String id;


    private String title;


    private String content;


    private String author;


    private String[] tags;


    private LocalDate createdAt;


    private LocalDate updatedAt;
}
