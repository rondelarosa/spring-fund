package com.example.repository;

import com.example.model.Speaker;

import java.util.List;

public interface ISpeakerRepository {
    List<Speaker> findAll();
}
