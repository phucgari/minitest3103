package com.controller;

import com.model.Category;
import com.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    ICategoryService categoryService;
    @GetMapping("create")
    public String showCreateForm(){
        return "/category/create";
    }
    @PostMapping("create")
    public String saveCategory(Category category,Model model){
        model.addAttribute("msg","created Category "+category.getName());
        categoryService.save(category);
        return "/category/create";
    }
}
