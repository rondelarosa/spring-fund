package com.example.repository;

import com.example.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class SpeakerRepository implements ISpeakerRepository {
    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Frua");
        speaker.setLastName("dela-Rosa");
        speakers.add(speaker);

        return speakers;
    }
}
