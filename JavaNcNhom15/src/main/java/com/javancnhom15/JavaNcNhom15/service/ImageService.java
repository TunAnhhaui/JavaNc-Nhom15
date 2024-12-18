package com.javancnhom15.JavaNcNhom15.service;

import java.util.List;

import com.javancnhom15.JavaNcNhom15.entity.Image;
import org.springframework.data.jpa.repository.Query;


public interface ImageService {

    List<Image> findByTourId(Long id);

    public Image addToTour(Long tourId,String url);

    void deleteById(Long id);
}

