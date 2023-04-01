package com.service;

import com.model.Category;
import com.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryService implements ICategoryService{
    @Autowired
    ICategoryRepository categoryRepository;
    @Override
    public List<Category> showAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category showByIndex(long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void delete(long id) {
        categoryRepository.deleteById(id);
    }
}
