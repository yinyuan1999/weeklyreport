package com.example.demo.service;


import com.example.demo.dao.time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface timeApplication extends JpaRepository<time,Integer> {
}
