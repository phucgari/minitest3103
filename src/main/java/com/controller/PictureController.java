package com.controller;

import com.model.Picture;
import com.service.ICategoryService;
import com.service.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/picture")
public class PictureController {
    @Autowired
    ICategoryService categoryService;
    @Autowired
    IPictureService pictureService;
    @GetMapping("list")
    public String showPictureList(Model model){
        model.addAttribute("pictures",pictureService.showAll());
        return "/picture/list";
    }
    @GetMapping("create")
    public String showCreateList(){
        return "/picture/create";
    }
    @PostMapping("save")
    public String savePicture(Picture picture){
        pictureService.save(picture);
        return "redirect:/picture/list";
    }
}