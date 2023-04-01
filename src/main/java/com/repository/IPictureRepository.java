package com.repository;

import com.model.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPictureRepository extends JpaRepository<Picture,Long> {
}
