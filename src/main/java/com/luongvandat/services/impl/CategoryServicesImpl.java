package com.luongvandat.services.impl;

import com.luongvandat.repositories.CategoryRepository;
import com.luongvandat.services.CategoryServices;
import org.springframework.stereotype.Service;

@Service
public class CategoryServicesImpl implements CategoryServices {
    private CategoryRepository categoryRepository;

    public CategoryServicesImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}