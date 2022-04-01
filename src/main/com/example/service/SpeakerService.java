package com.example.service;

import com.example.model.Speaker;
import com.example.repository.SpeakerRepository;

import java.util.List;

public class SpeakerService {
    SpeakerRepository repository = new SpeakerRepository();

    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
