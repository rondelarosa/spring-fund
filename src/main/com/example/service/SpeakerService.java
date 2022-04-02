package com.example.service;

import com.example.model.Speaker;
import com.example.repository.SpeakerRepository;

import java.util.List;

public class SpeakerService {
    private SpeakerRepository speakerRepository;

    public SpeakerService() {
    }

    public SpeakerService(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }
}
