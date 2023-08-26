package com.crimemap.crimemap.repository;

import com.crimemap.crimemap.entity.MapEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/* 삭제 수정 저장 기능*/
public interface MapRepository extends JpaRepository<MapEntity, Integer> {
}
