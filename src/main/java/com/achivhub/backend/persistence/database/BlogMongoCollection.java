package com.achivhub.backend.persistence.database;

import com.achivhub.backend.domain.model.Blog;
import com.achivhub.backend.persistence.documents.BlogDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogMongoCollection extends MongoRepository<BlogDocument, String> {
}
