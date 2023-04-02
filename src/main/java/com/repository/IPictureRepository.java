package com.repository;

import com.model.Category;
import com.model.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPictureRepository extends JpaRepository<Picture,Long> {
    List<Picture> findByCodeContaining(String firstname);
    List<Picture> findByCategory(Category category);
}
