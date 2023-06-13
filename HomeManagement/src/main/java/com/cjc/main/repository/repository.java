package com.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Home;

@Repository
public interface repository extends JpaRepository<Home, Integer> {

}
