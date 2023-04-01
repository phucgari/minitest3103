package com.service;

import com.model.Picture;
import com.repository.IPictureRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PictureService implements IPictureService{
    @Autowired
    IPictureRepository pictureRepository;
    @Override
    public List<Picture> showAll() {
        return pictureRepository.findAll();
    }

    @Override
    public Picture showByIndex(long id) {
        return pictureRepository.findById(id).get();
    }

    @Override
    public void save(Picture picture) {
        pictureRepository.save(picture);
    }

    @Override
    public void delete(long id) {
        pictureRepository.deleteById(id);
    }
}
