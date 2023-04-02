package com.service;

import com.model.Category;
import com.model.Picture;

import java.awt.print.Pageable;
import java.util.List;

public interface IPictureService extends IGenericService<Picture>{
    List<Picture> findByCodeContaining(String firstname);
    List<Picture> findByCategory(Category category);
}
