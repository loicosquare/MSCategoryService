package com.tech.categoryService.repository;

import com.tech.categoryService.entities.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
    Category findByCategoryName(String categoryName);
}
