package com.luongvandat.services.impl;

import com.luongvandat.entities.Category;
import com.luongvandat.repositories.CategoryRepository;
import com.luongvandat.services.CategoryServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServicesImpl implements CategoryServices {
    private final CategoryRepository categoryRepository;

    public CategoryServicesImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
//
//    @Override
//    public Category findOneById(String id) {
//        return categoryRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public Category add(Category category) {
//        return categoryRepository.save(category);
//    }
//
//    @Override
//    public Category deleteById(String id) {
//        Category category = findOneById(id);
//        categoryRepository.deleteById(id);
//        return category;
//    }
//
//    @Override
//    public Category update(Category category) {
//        return categoryRepository.save(category);
//    }
}