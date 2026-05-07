package com.ecommerce.project.service;
import  com.ecommerce.project.model.Category;
import java.util.List;

public interface CategoryService {

    void createCategory (Category category);

    String deleteCategory (Long categoryId);

    List<Category> getAllCategories();

    Category updateCategory(Category category, Long categoryId);
}
