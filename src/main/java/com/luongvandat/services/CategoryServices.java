package com.luongvandat.services;

import com.luongvandat.entities.Category;

public interface CategoryServices {
    Category findOneById(String id);

    Category add(Category category);

    Category deleteById(String id);

    Category update(Category category);
}