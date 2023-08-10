package com.crimemap.crimemap.repository;

import com.crimemap.crimemap.entity.MapEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapRepository extends JpaRepository<MapEntity, Integer> {
}
