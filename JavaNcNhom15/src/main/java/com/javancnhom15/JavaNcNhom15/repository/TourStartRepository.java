package com.javancnhom15.JavaNcNhom15.repository;

import java.util.List;

import com.javancnhom15.JavaNcNhom15.dto.TourStartDTO;
import com.javancnhom15.JavaNcNhom15.entity.TourStart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface TourStartRepository extends JpaRepository<TourStart, Long>{

    @Query("SELECT new com.javancnhom15.JavaNcNhom15.dto.TourStartDTO(d.id,d.ngay_khoi_hanh) FROM TourStart d WHERE d.tour_id = :tour_id")
    List<TourStartDTO> getDateStartByTourId(@Param("tour_id") Long tour_id);
}