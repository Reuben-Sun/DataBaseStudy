package com.reuben.databasestudy.service;

import com.reuben.databasestudy.entity.AthleteDetail;
import com.reuben.databasestudy.entity.Attend;
import com.reuben.databasestudy.entity.Event;
import com.reuben.databasestudy.mapper.AthleteDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AthleteService {
    @Autowired
    AthleteDetailMapper athleteDetailMapper;

    public AthleteDetail getAthleteById(int id){
        AthleteDetail detail = athleteDetailMapper.selectById(id);
        return detail;
    }
    
    public int insertAthlete(AthleteDetail detail){
        int i = athleteDetailMapper.insertAthlete(detail.getAthlete()); //运动员主键
        List<Event> events = detail.getEvents();
        for (Event e : events) {
            Attend attend = new Attend();
            attend.setAthleteId(detail.getAthlete().getId());
            attend.setEventId(e.getId());
            athleteDetailMapper.insertAttend(attend);
        }
        return i;
    }

    public List<AthleteDetail> getAllAthlete(){
        List<AthleteDetail> details = athleteDetailMapper.selectAll();
        return details;
    }
}
