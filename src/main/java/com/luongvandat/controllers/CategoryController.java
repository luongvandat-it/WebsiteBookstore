package com.luongvandat.controllers;

import com.luongvandat.entities.Category;
import com.luongvandat.services.CategoryServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/xyz")
public class CategoryController {
    private final CategoryServices categoryServices;

    public CategoryController(CategoryServices categoryServices) {
        this.categoryServices = categoryServices;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Category>> findAllCategories() {
        List<Category> categories = categoryServices.findAll();
        System.out.println(categories.get(1));
        if (categories.isEmpty()) {
            System.out.println("loi");
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return  new ResponseEntity<>(categories, HttpStatus.OK);
    }
//
//    @GetMapping("/getOne")
//    public Category findCategory() {
//        return categoryServices.findAll().get(1);
//    }
}
