package com.example.repository;

import com.example.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class SpeakerRepository implements ISpeakerRepository {

    @Autowired
    private Calendar calendar;

    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seedNum;

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker frua = new Speaker();
        frua.setFirstName("Frua");
        frua.setLastName("dela-Rosa");
        frua.setSeedNum(seedNum);
        speakers.add(frua);

        Speaker luke = new Speaker();
        luke.setFirstName("Luke");
        luke.setLastName("dela-Rosa");
        frua.setSeedNum(seedNum);
        speakers.add(luke);

        System.out.println("cal:" + calendar.getTime());

        return speakers;
    }
}
