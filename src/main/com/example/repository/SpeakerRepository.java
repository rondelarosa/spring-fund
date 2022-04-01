package com.example.repository;

import com.example.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class SpeakerRepository implements ISpeakerRepository {
    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker frua = new Speaker();
        frua.setFirstName("Frua");
        frua.setLastName("dela-Rosa");
        speakers.add(frua);

        Speaker luke = new Speaker();
        luke.setFirstName("Luke");
        luke.setLastName("dela-Rosa");
        speakers.add(luke);

        return speakers;
    }
}
