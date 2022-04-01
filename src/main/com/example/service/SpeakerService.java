package com.example.service;

import com.example.model.Speaker;
import com.example.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerService implements ISpeakerService {
    SpeakerRepository repository;

    public SpeakerService() {
        System.out.println("no constructor");
    }

    public SpeakerService(SpeakerRepository repository) {
        System.out.println("constructor injection");
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    @Autowired
    public void setSpeakerRepository(SpeakerRepository repository) {
        System.out.println("setter injection");
        this.repository = repository;
    }
}
