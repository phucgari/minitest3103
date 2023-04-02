package com.service;

import com.model.Category;
import com.model.Picture;
import com.repository.IPictureRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PictureService implements IPictureService{
    @Autowired
    IPictureRepository pictureRepository;
    @Override
    public List<Picture> showAll() {
        return pictureRepository.findAll();
    }

    @Override
    public Optional<Picture> showByIndex(long id) {
        return pictureRepository.findById(id);
    }

    @Override
    public void save(Picture picture) {
        pictureRepository.save(picture);
    }

    @Override
    public void delete(long id) {
        pictureRepository.deleteById(id);
    }

    @Override
    public List<Picture> findByCodeContaining(String code) {
        return pictureRepository.findByCodeContaining(code);
    }

    @Override
    public List<Picture> findByCategory(Category category) {
        return pictureRepository.findByCategory(category);
    }
}
