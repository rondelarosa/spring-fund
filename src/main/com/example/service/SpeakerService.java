package com.example.service;

import com.example.model.Speaker;
import com.example.repository.SpeakerRepository;

import java.util.List;

public class SpeakerService implements ISpeakerService {
    SpeakerRepository repository;

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
